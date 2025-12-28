import numpy as np


# Define the environment
grid_size = 5
num_actions = 4
start_state = (0, 0)
goal_state = (grid_size - 1, grid_size - 1)
obstacles = [(1, 1), (2, 2), (3, 3)]


# Initialize the Q-table
q_table = np.zeros((grid_size, grid_size, num_actions))

# Set hyperparameters
alpha = 0.1  # Learning rate
gamma = 0.6  # Discount factor
epsilon = 0.1  # Exploration vs. exploitation factor

# Define reward and transition functions
def get_reward(state):
    if state == goal_state:
        return 10
    elif state in obstacles:
        return -10
    else:
        return -1

def get_next_state(state, action):
    x, y = state
    if action == 0:  # Move up
        next_state = (max(x - 1, 0), y)
    elif action == 1:  # Move down
        next_state = (min(x + 1, grid_size - 1), y)
    elif action == 2:  # Move left
        next_state = (x, max(y - 1, 0))
    else:  # Move right
        next_state = (x, min(y + 1, grid_size - 1))
    return next_state




# Training loop
num_episodes = 1000
for episode in range(num_episodes):
    state = start_state
    done = False

    while not done:
        # Exploration vs. exploitation
        if np.random.uniform(0, 1) < epsilon:
            action = np.random.randint(num_actions)
        else:
            action = np.argmax(q_table[state])

        next_state = get_next_state(state, action)
        reward = get_reward(next_state)

        # Update Q-value
        q_table[state][action] += alpha * (reward + gamma * np.max(q_table[next_state]) - q_table[state][action])

        state = next_state

        if state == goal_state or state in obstacles:
            done = True



# Testing the trained agent
state = start_state
done = False

while not done:
    action = np.argmax(q_table[state])
    next_state = get_next_state(state, action)
    reward = get_reward(next_state)

    state = next_state
    print(f"Current state: {state}")

    if state == goal_state or state in obstacles:
        done = True


print("\n=== Q-TABLE ===")
for i in range(grid_size):
    for j in range(grid_size):
        print(f"State ({i},{j}) : {q_table[i, j]}")
    print()