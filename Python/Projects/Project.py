import numpy as np

def create_grid(rows=6, cols=6):
    """Creates an empty grid."""
    return np.full((rows, cols), ".", dtype=str)

def place_elements(rows=6, cols=6):
    """
    Randomly places Robot, Treasure, and 2 Traps on unique positions.
    Returns: robot_pos, treasure_pos, traps_pos
    """
    positions = set()
    while len(positions) < 4:
        positions.add(tuple(np.random.randint(0, min(rows, cols), size=2)))
    
    positions_list = list(positions)
    robot = np.array(positions_list[0])
    treasure = np.array(positions_list[1])
    traps = [np.array(p) for p in positions_list[2:]]
    
    return robot, treasure, traps

def render(rows, cols, robot, treasure, traps):
    """
    Renders the grid based on the current positions.
    """
    grid = create_grid(rows, cols)
    
    # Place Traps
    for p in traps:
        grid[p[0], p[1]] = "P"
        
    # Place Treasure
    grid[treasure[0], treasure[1]] = "T"
    
    # Place Robot
    grid[robot[0], robot[1]] = "R"
    
    print("\n" + "-"*13)
    print(grid)
    print("-"*13)

def move_robot(robot, action, rows=6, cols=6):
    """
    Returns the new robot position based on action.
    Action: 0 (Up), 1 (Right), 2 (Down), 3 (Left)
    """
    new_r = robot.copy()
    
    if action == 0:   # Up
        new_r[0] -= 1
    elif action == 1: # Right
        new_r[1] += 1
    elif action == 2: # Down
        new_r[0] += 1
    elif action == 3: # Left
        new_r[1] -= 1
        
    # Check boundaries
    if 0 <= new_r[0] < rows and 0 <= new_r[1] < cols:
        return new_r
    else:
        print("Movement blocked: Out of bounds!")
        return robot

def check_game_over(robot, treasure, traps):
    """
    Checks if the game is over.
    Returns: 'win', 'loss', or None
    """
    if np.array_equal(robot, treasure):
        return 'win'
    
    for p in traps:
        if np.array_equal(robot, p):
            return 'loss'
            
    return None

def main():
    ROWS, COLS = 6, 6
    robot, treasure, traps = place_elements(ROWS, COLS)
    
    actions_map = {
        'z': 0, 'up': 0,
        'd': 1, 'right': 1,
        's': 2, 'down': 2,
        'q': 3, 'left': 3
    }
    
    print("Welcome to the Robot Game (Simple Version)!")
    print("Controls: Z (Up), Q (Left), S (Down), D (Right)")
    print("Find the Treasure (T) and avoid the Traps (P)!")
    
    while True:
        render(ROWS, COLS, robot, treasure, traps)
        
        status = check_game_over(robot, treasure, traps)
        if status == 'win':
            print("\n>>> YOU FOUND THE TREASURE! YOU WIN! <<<")
            break
        elif status == 'loss':
            print("\n>>> BOOM! YOU HIT A TRAP! GAME OVER. <<<")
            break
            
        user_input = input("Move (z/q/s/d) or 'exit': ").lower().strip()
        
        if user_input == 'exit':
            break
            
        if user_input in actions_map:
            robot = move_robot(robot, actions_map[user_input], ROWS, COLS)
        else:
            print("Invalid input. Use z, q, s, d.")

if __name__ == "__main__":
    main()