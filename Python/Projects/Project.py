import numpy as np


def create_grille():
    grid = np.full((6, 6), ".", dtype=str)
    return grid



def place_element():
    positions = set()

    while len(positions) < 4:
        positions.add(tuple(np.random.randint(0, 6, size=2)))

    positions = np.array(list(positions))

    robot_pos = positions[0]
    tresor_pos = positions[1]
    pieges_pos = positions[2:4]

    return [robot_pos , tresor_pos , pieges_pos]


def render():
    grid = np.full((6, 6), "*", dtype=str)
    positions = place_element()
    R = positions[0]
    T = positions[1]
    P = positions[2]
    grid[R[0] , R[1]] = "R"
    grid[T[0] , T[1]] = "T"
    grid[P[0 , 0] , P[0,1]] = "P"
    grid[P[1 , 0] , P[1,0]] = "P"
    print(grid)



def deplace_robot(action , pos):
    grid = np.full((6, 6), "*", dtype=str)
    R = pos
    if action == 0:
        R[0] -= 1
    elif action == 1:
        R[1] += 1
    elif action == 2:
        R[0] += 1
    elif action == 3:
        R[1] -= 1
    
    return R


pos = place_element[0]