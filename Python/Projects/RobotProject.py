import numpy as np


def create_grid():
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
    grid = create_grid()
    grid[robot_pos[0], robot_pos[1]] = "R"
    grid[tresor_pos[0], tresor_pos[1]] = "T"
    grid[pieges_pos[0, 0], pieges_pos[0, 1]] = "P"
    grid[pieges_pos[1, 0], pieges_pos[1, 1]] = "P"
    
    for row in grid:
        print(" ".join(row))
    print()


def deplace_robot(action, pos):
    R = pos.copy()

    if action == 0:      # haut
        R[0] -= 1
    elif action == 1:    # droite
        R[1] += 1
    elif action == 2:    # bas
        R[0] += 1
    elif action == 3:    # gauche
        R[1] -= 1

    R[0] = np.clip(R[0], 0, 5)
    R[1] = np.clip(R[1], 0, 5)

    return R


def step(action, robot_pos, tresor_pos, pieges_pos):
    robot_pos = deplace_robot(action, robot_pos)

    reward = -1
    done = False

    if np.array_equal(robot_pos, tresor_pos):
        reward = 10
        done = True
    elif any(np.array_equal(robot_pos, p) for p in pieges_pos):
        reward = -10
        done = True

    return robot_pos, reward, done


def jouer_aleatoirement():
    robot_pos, tresor_pos, pieges_pos = place_element()
    robot_pos = robot_pos.copy()

    total_score = 0

    for _ in range(50):
        action = np.random.randint(0, 4)
        robot_pos, reward, done = step(action, robot_pos, tresor_pos, pieges_pos)
        total_score += reward

        if done:
            break

    return total_score


def simulation(nb_parties=200):
    scores = [jouer_aleatoirement() for _ in range(nb_parties)]
    print("Score moyen (aléatoire):", np.mean(scores))
    print("Score max   :", np.max(scores))
    print("Score min   :", np.min(scores))


def pos_state(robot_pos):
    return robot_pos[0] * 6 + robot_pos[1]


def epsilon_greedy(robot_pos, Q, epsilon):
    state = pos_state(robot_pos)
    if np.random.rand() < epsilon:
        return np.random.randint(0, 4)
    else:
        return np.argmax(Q[state])


# Hyperparamètres
alpha = 0.1
gamma = 0.9
epsilon = 0.2
episodes = 5000  # Increased for better learning
max_steps = 50

Q = np.zeros((36, 4))

# Fixed environment for training
ROBOT_START = None
TRESOR_POS = None
PIEGES_POS = None


def entrainer():
    global Q, ROBOT_START, TRESOR_POS, PIEGES_POS
    
    # Create ONE fixed environment for all training episodes
    ROBOT_START, TRESOR_POS, PIEGES_POS = place_element()

    for ep in range(episodes):
        robot_pos = ROBOT_START.copy()

        for _ in range(max_steps):
            state = pos_state(robot_pos)
            action = epsilon_greedy(robot_pos, Q, epsilon)

            new_pos, reward, done = step(
                action, robot_pos, TRESOR_POS, PIEGES_POS
            )
            new_state = pos_state(new_pos)

            # Q-learning update
            Q[state, action] += alpha * (
                reward + gamma * np.max(Q[new_state]) - Q[state, action]
            )

            robot_pos = new_pos

            if done:
                break



def jouer_agent(affichage=False, robot_start=None, tresor=None, pieges=None):
    
    if robot_start is None:
        robot_pos = ROBOT_START.copy()
        tresor_pos = TRESOR_POS
        pieges_pos = PIEGES_POS
    else:
        robot_pos = robot_start.copy()
        tresor_pos = tresor
        pieges_pos = pieges

    total_score = 0

    if affichage:
        print("État initial:")
        render(robot_pos, tresor_pos, pieges_pos)

    for step_num in range(50):
        action = np.argmax(Q[pos_state(robot_pos)])
        robot_pos, reward, done = step(action, robot_pos, tresor_pos, pieges_pos)
        total_score += reward

        if affichage:
            actions_names = ["HAUT", "DROITE", "BAS", "GAUCHE"]
            print(f"Step {step_num + 1}: Action {actions_names[action]}, Reward: {reward}")
            render(robot_pos, tresor_pos, pieges_pos)

        if done:
            if affichage:
                if reward > 0:
                    print("🎉 Trésor trouvé!")
                else:
                    print("💥 Piège activé!")
            break

    return total_score


def tester_agent_sur_environnement_fixe(nb_parties=100):
    scores = [jouer_agent() for _ in range(nb_parties)]
    return scores



print("\n=== AVANT APPRENTISSAGE ===")
print("Performance aléatoire sur environnements variés:")
simulation(200)

entrainer()

print("\n" + "=" * 60)
print("APRÈS APPRENTISSAGE")
print("=" * 60)

print("\n=== TEST 1: Sur l'environnement d'entraînement ===")
scores_entrainement = tester_agent_sur_environnement_fixe(200)
print(f"Score moyen: {np.mean(scores_entrainement):.2f}")
print(f"Score max  : {np.max(scores_entrainement)}")
print(f"Score min  : {np.min(scores_entrainement)}")

print("\n=== TEST 2: Démonstration visuelle (environnement d'entraînement) ===")
jouer_agent(affichage=True)


