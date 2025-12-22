import numpy as np


def create_grille():
    return np.full((6, 6), "*", dtype=str)



def place_element():
    positions = set()

    while len(positions) < 4:
        positions.add(tuple(np.random.randint(0, 6, size=2)))

    positions = np.array(list(positions))

    robot_pos = positions[0]
    tresor_pos = positions[1]
    pieges_pos = positions[2:4]

    return robot_pos, tresor_pos, pieges_pos



def render(robot_pos, tresor_pos, pieges_pos):
    grid = create_grille()

    grid[robot_pos[0], robot_pos[1]] = "R"
    grid[tresor_pos[0], tresor_pos[1]] = "T"
    grid[pieges_pos[0, 0], pieges_pos[0, 1]] = "P"
    grid[pieges_pos[1, 0], pieges_pos[1, 1]] = "P"

    print(grid)
    print()



def deplace_robot(action, pos):
    R = pos.copy()

    if action == 0:     
        R[0] -= 1
    elif action == 1:    
        R[1] += 1
    elif action == 2:    
        R[0] += 1
    elif action == 3:    
        R[1] -= 1

    R[0] = np.clip(R[0], 0, 5)
    R[1] = np.clip(R[1], 0, 5)

    return R



def step(action, robot_pos, tresor_pos, pieges_pos):
    robot_pos = deplace_robot(action, robot_pos)

    score = -1
    done = False

    if np.array_equal(robot_pos, tresor_pos):
        score = 10
        done = True

    elif any(np.array_equal(robot_pos, p) for p in pieges_pos):
        score = -10
        done = True

    return robot_pos, score, done



def jouer_aleatoirement():
    robot_pos, tresor_pos, pieges_pos = place_element()
    robot_pos = robot_pos.copy()

    total_score = 0

    for _ in range(50): 
        action = np.random.randint(0, 4)
        robot_pos, score, done = step(action, robot_pos, tresor_pos, pieges_pos)
        total_score += score


        if done:
            break

    return total_score



def simulation(nb_parties=200):
    scores = []

    for _ in range(nb_parties):
        scores.append(jouer_aleatoirement())

    print("Score moyen :", np.mean(scores))
    print("Score max   :", np.max(scores))
    print("Score min   :", np.min(scores))


simulation(200)


Q = np.zeros(36,4)

def populate_Q():
    return 1


def pos_state(robot_pos):
    return robot_pos[0] * 6 + robot_pos[1]    


def epsilon_greedy(robot_pos, Q, epsilon=0.2):
    state = pos_state(robot_pos)

    if np.random.rand() < epsilon:
        action = np.random.randint(0, 4)
    else:
        action = np.argmax(Q[state])

    return action
