import tkinter as tk
from tkinter import ttk, scrolledtext
import threading
import requests
import random
import time
import json
import logging
import re
import os

# Instagram Automation Class
class InstagramCloseFriendsAutomation:
    def __init__(self, session_id, batch_size=50, batch_interval=5):
        self.session_id = session_id
        self.batch_size = batch_size
        self.batch_interval = batch_interval
        self.running = False
        self.on_batch_complete = None
        self.error_count = 0
        self.max_errors = 3
        
        # Initialize session
        self.session = requests.Session()
        
        # Set essential cookies
        self.session.cookies.set('sessionid', session_id, domain='.instagram.com')
        self.session.cookies.set('ig_did', self._generate_uuid(), domain='.instagram.com')
        self.session.cookies.set('ig_nrcb', '1', domain='.instagram.com')
        self.session.cookies.set('mid', self._generate_uuid(), domain='.instagram.com')
        
        # Update headers
        self._update_request_headers()

    def get_user_id(self):
        try:
            response = self.session.get('https://www.instagram.com/settings/edit/')
            logging.info(f"Requesting user data - Status code: {response.status_code}")
            
            if response.status_code == 200:
                content = response.text
                user_id = None
                
                if '"viewerId":"' in content:
                    start_idx = content.find('"viewerId":"') + 12
                    end_idx = content.find('"', start_idx)
                    user_id = content[start_idx:end_idx]
                    if user_id and user_id.isdigit():
                        logging.info(f"Found user ID (method 1): {user_id}")
                        return user_id
                
                if '"profilePage_' in content:
                    start_idx = content.find('"profilePage_') + 12
                    end_idx = content.find('"', start_idx)
                    user_id = content[start_idx:end_idx]
                    if user_id and user_id.isdigit():
                        logging.info(f"Found user ID (method 2): {user_id}")
                        return user_id
                
                app_id = response.headers.get('x-ig-set-www-claim')
                if app_id:
                    logging.info(f"Found X-IG-App-ID: {app_id}")
                    self.session.headers.update({'X-IG-WWW-Claim': app_id})
                
                logging.info("Could not find user ID in response, trying alternative method...")
            
            response = self.session.get('https://www.instagram.com/data/shared_data/')
            if response.status_code == 200:
                try:
                    data = response.json()
                    if 'config' in data and 'viewerId' in data['config']:
                        user_id = data['config']['viewerId']
                        logging.info(f"Found user ID from shared data: {user_id}")
                        return user_id
                except Exception as e:
                    logging.error(f"Error parsing shared data: {str(e)}")
            
            logging.error("Could not get user ID")
            return None
                
        except Exception as e:
            logging.error(f"Error getting user ID: {str(e)}")
            return None

    def get_followers(self, user_id, max_followers=1000, start_cursor=''):
        followers = []
        end_cursor = start_cursor
        
        try:
            while len(followers) < max_followers:
                variables = {
                    'id': user_id,
                    'include_reel': True,
                    'fetch_mutual': False,
                    'first': 50,
                    'after': end_cursor
                }
                
                url = f"https://www.instagram.com/graphql/query/?query_hash=c76146de99bb02f6415203be841dd25a&variables={json.dumps(variables)}"
                logging.info(f"Requesting followers from URL: {url}")
                
                response = self.session.get(url)
                logging.info(f"Response status code: {response.status_code}")
                
                if response.status_code != 200:
                    logging.error(f"Failed to get followers: {response.status_code}")
                    break
                
                try:
                    data = response.json()
                    logging.info("Successfully parsed JSON response")
                except json.JSONDecodeError as e:
                    logging.error(f"Failed to parse JSON response: {str(e)}")
                    break
                
                try:
                    edges = data['data']['user']['edge_followed_by']['edges']
                    logging.info(f"Found {len(edges)} followers in this batch")
                except KeyError as e:
                    logging.error(f"Unexpected response format: {str(e)}")
                    break
                
                if not edges:
                    logging.info("No more followers found")
                    break
                    
                for edge in edges:
                    follower_id = edge['node']['id']
                    if follower_id not in self.processed_users:
                        followers.append(follower_id)
                
                page_info = data['data']['user']['edge_followed_by']['page_info']
                if page_info['has_next_page'] and len(followers) < max_followers:
                    end_cursor = page_info['end_cursor']
                    logging.info(f"Moving to next page with cursor: {end_cursor}")
                    time.sleep(random.uniform(1.5, 3))
                else:
                    break
                
                logging.info(f"Successfully fetched {len(followers)} followers")
                return followers, end_cursor
            
        except Exception as e:
            logging.error(f"Error getting followers: {str(e)}")
            return followers, end_cursor

    def _verify_request_data(self, user_ids):
        """Verify that the request data is valid before sending to Instagram."""
        try:
            # Check if we have user IDs
            if not user_ids:
                logging.error("No user IDs provided")
                return False
                
            # Check if user IDs are valid
            for uid in user_ids:
                try:
                    # Ensure ID can be converted to string and int
                    str_id = str(uid)
                    int(str_id)
                except (ValueError, TypeError):
                    logging.error(f"Invalid user ID format: {uid}")
                    return False
            
            # Check if we have required session data
            if not self.session_id:
                logging.error("No session ID available")
                return False
                
            # Check if session is valid
            if not self.verify_session():
                logging.error("Invalid session")
                return False
                
            return True
            
        except Exception as e:
            logging.error(f"Error verifying request data: {str(e)}")
            return False

    def _get_random_user_agent(self):
        """Generate a random modern user agent string."""
        chrome_versions = ['120.0.0.0', '121.0.0.0', '122.0.0.0']
        platforms = [
            'Windows NT 10.0; Win64; x64',
            'Macintosh; Intel Mac OS X 10_15_7',
            'X11; Linux x86_64'
        ]
        
        platform = random.choice(platforms)
        chrome_version = random.choice(chrome_versions)
        
        return f'Mozilla/5.0 ({platform}) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/{chrome_version} Safari/537.36'

    def _update_request_headers(self):
        """Update session headers with required values."""
        self.session.headers.update({
            'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
            'Accept': '*/*',
            'Accept-Language': 'en-US,en;q=0.9',
            'Accept-Encoding': 'gzip, deflate, br',
            'X-Instagram-AJAX': '1006631170',
            'X-IG-App-ID': '936619743392459',
            'X-ASBD-ID': '129477',
            'Origin': 'https://www.instagram.com',
            'DNT': '1',
            'Connection': 'keep-alive',
            'Referer': 'https://www.instagram.com/',
            'Sec-Fetch-Dest': 'empty',
            'Sec-Fetch-Mode': 'cors',
            'Sec-Fetch-Site': 'same-origin',
            'Sec-GPC': '1',
            'TE': 'trailers'
        })

    def add_to_close_friends(self, user_ids, max_retries=3, retry_delay=5):
        """Add users to close friends list."""
        if not user_ids:
            return False

        try:
            # Get fresh CSRF token
            csrf_token = self._get_csrf_token()
            if not csrf_token:
                logging.error("Failed to get CSRF token")
                return False

            # Update headers
            self._update_request_headers()
            self.session.headers.update({
                'X-CSRFToken': csrf_token,
                'X-Instagram-AJAX': '1',
                'X-IG-App-ID': '936619743392459',
                'X-ASBD-ID': '129477',
                'Content-Type': 'application/x-www-form-urlencoded',
                'Accept': '*/*',
                'Accept-Language': 'en-US,en;q=0.9',
                'Origin': 'https://www.instagram.com',
                'Referer': 'https://www.instagram.com/accounts/close_friends/',
                'Sec-Fetch-Dest': 'empty',
                'Sec-Fetch-Mode': 'cors',
                'Sec-Fetch-Site': 'same-origin'
            })

            # Convert user_ids to strings if they're not already
            user_ids_str = [str(uid) for uid in user_ids]

            # Prepare request data
            data = {
                'add': json.dumps(user_ids_str),
                'remove': '[]',
                '_uuid': self._generate_uuid(),
                '_uid': self.get_user_id(),
                '_csrftoken': csrf_token,
                'module': 'close_friends_list',
                'source': 'audience_manager'
            }

            # Log request details
            logging.info(f"Sending request to add users: {user_ids_str}")
            logging.info(f"Using CSRF token: {csrf_token}")

            # Make the request with retries
            for attempt in range(max_retries):
                try:
                    # Try the old endpoint first
                    response = self.session.post(
                        'https://www.instagram.com/api/v1/friendships/set_besties/',
                        data=data,
                        timeout=10
                    )
                    
                    # Log response details
                    logging.info(f"Response status: {response.status_code}")
                    logging.info(f"Response headers: {dict(response.headers)}")
                    logging.info(f"Response content: {response.text[:200]}")
                    
                    if response.status_code == 200:
                        try:
                            data = response.json()
                            if data.get('status') == 'ok':
                                logging.info(f"✅ Successfully added {len(user_ids)} users to close friends")
                                return True
                            else:
                                error_type = data.get('error_type', 'unknown')
                                error_msg = data.get('message', 'No message')
                                logging.error(f"API Error: {error_type} - {error_msg}")
                                
                                if 'login_required' in error_type.lower():
                                    logging.error("Session expired. Please log in again.")
                                    return False
                        except json.JSONDecodeError:
                            logging.error(f"Failed to parse response JSON: {response.text[:100]}")
                    elif response.status_code == 429:
                        logging.error("Rate limit exceeded")
                        time.sleep(30)  # Wait 30 seconds before retry
                    elif response.status_code == 403:
                        logging.error("Access denied - Session might be expired")
                        return False
                    elif response.status_code == 400:
                        logging.error(f"Bad request error: {response.text[:200]}")
                        # Try alternate endpoint
                        alternate_data = {
                            'source': 'profile',
                            'add_users': json.dumps(user_ids_str),
                            '_uuid': self._generate_uuid(),
                            '_uid': self.get_user_id(),
                            '_csrftoken': csrf_token
                        }
                        
                        response = self.session.post(
                            'https://www.instagram.com/api/v1/friendships/set_close_friends_list/',
                            data=alternate_data,
                            timeout=10
                        )
                        
                        if response.status_code == 200:
                            data = response.json()
                            if data.get('status') == 'ok':
                                logging.info("✅ Success with alternate endpoint!")
                                return True
                    
                    if attempt < max_retries - 1:
                        wait_time = retry_delay * (2 ** attempt)
                        logging.info(f"Retrying in {wait_time} seconds... (Attempt {attempt + 1}/{max_retries})")
                        time.sleep(wait_time)
                    
                except requests.exceptions.RequestException as e:
                    logging.error(f"Request error: {str(e)}")
                    if attempt < max_retries - 1:
                        time.sleep(retry_delay)
                    else:
                        raise
            
            return False
            
        except Exception as e:
            logging.error(f"Error adding users to close friends: {str(e)}")
            return False

    def _get_csrf_token(self):
        """Get a fresh CSRF token."""
        try:
            response = self.session.get('https://www.instagram.com/accounts/close_friends/', timeout=10)
            
            # Try to extract from cookies first
            csrf_token = self.session.cookies.get('csrftoken')
            if csrf_token:
                return csrf_token
                
            # Try to extract from response
            match = re.search(r'"csrf_token":"([^"]+)"', response.text)
            if match:
                return match.group(1)
                
            logging.error("Could not find CSRF token")
            return None
            
        except Exception as e:
            logging.error(f"Error getting CSRF token: {str(e)}")
            return None

    def _generate_uuid(self):
        return ''.join(random.choice('0123456789abcdef') for _ in range(32))

    def verify_session(self):
        """Verify that the session is valid."""
        try:
            # First try to get the user info
            response = self.session.get(
                'https://www.instagram.com/api/v1/users/web_profile_info/?username=instagram',
                timeout=10
            )
            
            if response.status_code == 200:
                logging.info("✅ Session verified successfully")
                return True
                
            # If that fails, try the accounts page
            response = self.session.get(
                'https://www.instagram.com/accounts/edit/',
                timeout=10
            )
            
            if response.status_code == 200 and 'login' not in response.url:
                logging.info("✅ Session verified successfully (alternate method)")
                return True
            
            # One last try with the close friends page
            response = self.session.get(
                'https://www.instagram.com/accounts/close_friends/',
                timeout=10
            )
            
            if response.status_code == 200 and 'login' not in response.url:
                logging.info("✅ Session verified successfully (close friends page)")
                return True
                
            logging.error(f"Session verification failed - Status: {response.status_code}")
            if 'login' in response.url:
                logging.error("Session expired - Please get a new session ID")
            return False
            
        except Exception as e:
            logging.error(f"Error verifying session: {str(e)}")
            return False

    def _format_time(self, seconds):
        """Format time in seconds to a human-readable string."""
        if seconds < 60:
            return f"{seconds:.1f} seconds"
        elif seconds < 3600:
            minutes = seconds / 60
            return f"{minutes:.1f} minutes"
        else:
            hours = seconds / 3600
            return f"{hours:.1f} hours"

    def _adjust_timing(self, success):
        """Dynamically adjust timing based on success/failure patterns."""
        self.last_success_times = [t for t in self.last_success_times if time.time() - t < 3600]
        
        if success:
            self.last_success_times.append(time.time())
            self.error_count = max(0, self.error_count - 1)  # Reduce error count on success
            
            if self.high_speed_mode:
                if self.error_count == 0:
                    self.optimal_delay = max(self.min_delay, 3)  # Aggressive 3s delay
                    self.parallel_requests = 2  # Allow parallel requests
            else:
                # Normal mode logic
                self.success_rate = len(self.last_success_times) / max(len(self.last_delays), 1)
                if self.success_rate > 0.9 and len(self.last_success_times) >= 5:
                    self.optimal_delay = max(self.min_delay, self.optimal_delay * 0.9)
        else:
            self.error_count += 1
            if self.error_count >= self.max_errors:
                self.high_speed_mode = False  # Disable high speed mode if too many errors
                self.optimal_delay = 30  # Reset to safe delay
                self.parallel_requests = 1
                logging.warning("⚠️ Too many errors - switching to safe mode")
            elif self.high_speed_mode:
                self.optimal_delay = min(30, self.optimal_delay * 1.5)
                self.parallel_requests = 1  # Reduce parallel requests on error
            
        hour_requests = len(self.last_success_times)
        if hour_requests > 0:
            logging.info(f"📊 Speed: {hour_requests} requests/hour | Delay: {self._format_time(self.optimal_delay)}")
        
        return self.optimal_delay

    async def _add_user_async(self, user_id):
        """Add a single user asynchronously."""
        try:
            success = self.add_to_close_friends([user_id])
            return user_id, success
        except Exception as e:
            logging.error(f"Error adding user {user_id}: {str(e)}")
            return user_id, False

    def run(self, max_followers=1000, start_cursor=''):
        try:
            user_id = self.get_user_id()
            if not user_id:
                raise Exception("Failed to get user ID")
            
            # Verify session is valid
            if not self.verify_session():
                raise Exception("Session verification failed")
            
            processed_count = 0
            batch_count = 0
            
            while processed_count < max_followers and self.running:
                batch_count += 1
                logging.info(f"\n📦 Processing batch #{batch_count}")
                
                # Get a small batch of followers
                batch_size = 3  # Process in very small batches
                followers, end_cursor = self.get_followers(user_id, max_followers=batch_size, start_cursor=start_cursor)
                
                if not followers:
                    logging.info("No more followers to process")
                    break
                
                logging.info(f"Found {len(followers)} followers to process")
                
                # Process each follower
                for follower_id in followers:
                    if not self.running:
                        break
                    
                    # Try to add the follower
                    if self.add_to_close_friends([follower_id]):
                        processed_count += 1
                        if self.on_batch_complete:
                            self.on_batch_complete(1)
                        logging.info(f"✅ Added follower {processed_count}/{max_followers}")
                        
                        # Short delay between successful adds
                        delay = random.uniform(3, 5)
                        logging.info(f"Waiting {delay:.1f}s...")
                        time.sleep(delay)
                    else:
                        logging.error(f"❌ Failed to add follower")
                        # Longer delay after failure
                        time.sleep(random.uniform(10, 15))
                
                # Move to next batch
                start_cursor = end_cursor
                if not end_cursor:
                    logging.info("Reached end of followers list")
                    break
                
                # Short break between batches
                if processed_count < max_followers:
                    batch_delay = random.uniform(8, 12)
                    logging.info(f"Taking a {batch_delay:.1f}s break before next batch...")
                    time.sleep(batch_delay)
            
            return end_cursor
            
        except Exception as e:
            logging.error(f"Error in automation: {str(e)}")
            raise

def save_progress(count, cursor):
    """Save progress to a file."""
    try:
        progress = {
            'completed_count': count,
            'cursor': cursor,
            'timestamp': time.time()
        }
        with open('close_friends_progress.json', 'w') as f:
            json.dump(progress, f)
        logging.info(f"Progress saved: {count} users processed")
    except Exception as e:
        logging.error(f"Error saving progress: {str(e)}")

def load_progress():
    """Load progress from file."""
    try:
        if os.path.exists('close_friends_progress.json'):
            with open('close_friends_progress.json', 'r') as f:
                progress = json.load(f)
                # Check if progress is less than 24 hours old
                if time.time() - progress.get('timestamp', 0) < 86400:
                    count = progress.get('completed_count', 0)
                    cursor = progress.get('cursor', '')
                    logging.info(f"Loaded previous progress: {count} users")
                    return count, cursor
        return 0, ''
    except Exception as e:
        logging.error(f"Error loading progress: {str(e)}")
        return 0, ''

# GUI Application
class InstagramCloseFriendsApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Instagram Close Friends Automation")
        self.root.geometry("600x500")
        
        # Initialize variables
        self.running = False
        self.progress_var = tk.DoubleVar()
        
        # Create GUI elements first
        self.create_gui()
        
        # Then configure logging
        self.setup_logging()
    
    def create_gui(self):
        """Create all GUI elements."""
        self.mainframe = ttk.Frame(self.root, padding="20")
        self.mainframe.grid(column=0, row=0, sticky=(tk.N, tk.W, tk.E, tk.S))
        
        # Session ID input
        ttk.Label(self.mainframe, text="Session ID:").grid(column=0, row=0, sticky=tk.W)
        self.session_id = tk.StringVar()
        self.session_entry = ttk.Entry(self.mainframe, width=50, textvariable=self.session_id)
        self.session_entry.grid(column=1, row=0, pady=5)
        
        # Batch size input
        ttk.Label(self.mainframe, text="Batch Size:").grid(column=0, row=1, sticky=tk.W)
        self.batch_size = tk.StringVar(value="10")
        ttk.Entry(self.mainframe, width=10, textvariable=self.batch_size).grid(column=1, row=1, sticky=tk.W, pady=5)
        
        # Batch interval input
        ttk.Label(self.mainframe, text="Interval (minutes):").grid(column=0, row=2, sticky=tk.W)
        self.batch_interval = tk.StringVar(value="2")
        ttk.Entry(self.mainframe, width=10, textvariable=self.batch_interval).grid(column=1, row=2, sticky=tk.W, pady=5)
        
        # Start/Stop button
        self.start_button = ttk.Button(self.mainframe, text="Start", command=self.start_automation)
        self.start_button.grid(column=0, row=3, columnspan=2, pady=10)
        
        # Status label
        self.status_label = ttk.Label(self.mainframe, text="")
        self.status_label.grid(column=0, row=4, columnspan=2, pady=5)
        
        # Progress bar
        self.progress_bar = ttk.Progressbar(
            self.mainframe, 
            length=300, 
            mode='determinate', 
            variable=self.progress_var
        )
        self.progress_bar.grid(column=0, row=5, columnspan=2, pady=5)
        
        # Log area
        self.log_area = scrolledtext.ScrolledText(
            self.mainframe,
            width=60,
            height=20,
            wrap=tk.WORD,
            font=('Courier', 9)
        )
        self.log_area.grid(column=0, row=6, columnspan=2, pady=10)
        
        # Configure grid weights
        self.root.columnconfigure(0, weight=1)
        self.root.rowconfigure(0, weight=1)
        self.mainframe.columnconfigure(1, weight=1)
        self.mainframe.rowconfigure(6, weight=1)
        
        # Set up window close handler
        self.root.protocol("WM_DELETE_WINDOW", self.on_closing)
    
    def setup_logging(self):
        """Configure logging to the text widget."""
        self.log_handler = TextHandler(self.log_area)
        formatter = logging.Formatter('%(message)s')
        self.log_handler.setFormatter(formatter)
        self.logger = logging.getLogger('InstagramApp')
        self.logger.addHandler(self.log_handler)
        self.logger.setLevel(logging.INFO)

    def get_session_id_instructions(self):
        """Show instructions for getting a valid session ID."""
        instructions = """
❓ How to get your Instagram session ID:

1. Go to Instagram.com and log in
2. Right-click anywhere on the page and select 'Inspect' (or press F12)
3. Go to the 'Application' or 'Storage' tab
4. Under 'Cookies', click on 'https://www.instagram.com'
5. Find the cookie named 'sessionid'
6. Copy the entire value and paste it here

Note: The session ID usually starts with numbers and contains both numbers and letters.
If it's not working, try logging out and back in to get a fresh session ID.
"""
        self.logger.info(instructions)

    def start_automation(self):
        if not self.running:
            session_id = self.session_id.get().strip()
            if not session_id:
                self.logger.info("❌ Please enter a session ID")
                self.get_session_id_instructions()
                return
                
            try:
                batch_size = int(self.batch_size.get())
                batch_interval = int(self.batch_interval.get())
                if batch_size <= 0 or batch_interval <= 0:
                    raise ValueError
            except ValueError:
                self.logger.info("❌ Please enter valid numbers for batch size and interval")
                return
            
            self.running = True
            self.start_button.config(text="Stop")
            self.status_label.config(text="Verifying session...")
            self.logger.info("\n=== Starting Automation ===")
            
            self.automation_thread = threading.Thread(
                target=self.run_automation,
                args=(session_id, batch_size, batch_interval),
                daemon=True
            )
            self.automation_thread.start()
        else:
            self.running = False
            self.start_button.config(text="Start")
            self.status_label.config(text="Stopped")
            self.logger.info("\n=== Automation Stopped ===")

    def run_automation(self, session_id, batch_size, batch_interval):
        try:
            automation = InstagramCloseFriendsAutomation(
                session_id=session_id,
                batch_size=batch_size,
                batch_interval=batch_interval
            )
            automation.running = self.running
            
            if not automation.verify_session():
                self.logger.error("❌ Invalid session ID or session expired")
                raise Exception("Session verification failed")
                
            self.status_label.config(text="Session verified. Running...")
            self.logger.info("\n🔍 Getting your account information...")
            
            # Load previous progress
            completed_count, start_cursor = load_progress()
            total_to_add = 90  # Total number of followers to add
            
            self.logger.info(f"""
=== Automation Configuration ===
• Batch Size: {batch_size} followers
• Interval between batches: {batch_interval} minutes
• Previous progress loaded: {completed_count} followers
• Target total: {total_to_add} followers
==============================
""")
            
            try:
                self.progress_var.set(0)
                
                def update_progress(current, total):
                    progress = (current / total) * 100
                    self.progress_var.set(progress)
                    self.status_label.config(
                        text=f"Running: {current}/{total} followers added ({progress:.1f}%)"
                    )
                
                def on_batch_complete(batch_size):
                    nonlocal completed_count
                    completed_count += batch_size
                    update_progress(completed_count, total_to_add)
                    save_progress(completed_count, start_cursor)
                
                # Set up progress callback
                automation.on_batch_complete = on_batch_complete
                
                # Run automation
                end_cursor = automation.run(max_followers=total_to_add, start_cursor=start_cursor)
                
                # Update final progress
                self.progress_var.set(100)
                save_progress(completed_count, end_cursor)
                self.status_label.config(text="✅ Completed successfully!")
                self.logger.info("\n🎉 Completed! Added all followers to close friends")
                
            except Exception as e:
                self.logger.error(f"❌ Error during automation: {str(e)}")
                self.status_label.config(text="Error occurred")
                # Save progress on error
                save_progress(completed_count, start_cursor)
                
        except Exception as e:
            self.logger.error(f"❌ Setup error: {str(e)}")
            self.status_label.config(text="Setup failed")
        finally:
            if self.running:
                self.running = False
                self.logger.info("\n⚠️ Automation stopped")
                # Save final progress
                save_progress(completed_count, start_cursor)
            self.root.after(100, lambda: self.start_button.config(text="Start"))

    def on_closing(self):
        if self.running:
            self.running = False
            self.logger.info("\n=== Cleaning up before exit ===")
            if self.automation_thread and self.automation_thread.is_alive():
                self.automation_thread.join(timeout=1.0)
        self.root.destroy()

    def log(self, message):
        self.logger.info(message)

class TextHandler(logging.Handler):
    """Custom logging handler that writes to a tkinter text widget."""
    
    def __init__(self, text_widget):
        super().__init__()
        self.text_widget = text_widget
    
    def emit(self, record):
        msg = self.format(record)
        self.text_widget.configure(state='normal')
        self.text_widget.insert(tk.END, msg + '\n')
        self.text_widget.configure(state='disabled')
        self.text_widget.see(tk.END)
        self.text_widget.update()

if __name__ == "__main__":
    root = tk.Tk()
    app = InstagramCloseFriendsApp(root)
    root.mainloop()