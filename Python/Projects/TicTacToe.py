# Tic-Tac-Toe (X / O) in Python

board = [" " for _ in range(9)]

def print_board():
    print()
    print(f" {board[0]} | {board[1]} | {board[2]} ")
    print("---+---+---")
    print(f" {board[3]} | {board[4]} | {board[5]} ")
    print("---+---+---")
    print(f" {board[6]} | {board[7]} | {board[8]} ")
    print()

def check_winner(player):
    win_conditions = [
        (0,1,2), (3,4,5), (6,7,8),  # rows
        (0,3,6), (1,4,7), (2,5,8),  # columns
        (0,4,8), (2,4,6)            # diagonals
    ]
    for a, b, c in win_conditions:
        if board[a] == board[b] == board[c] == player:
            return True
    return False

def is_draw():
    return " " not in board

current_player = "X"

print("Tic-Tac-Toe Game")
print("Positions are from 1 to 9 (left to right)")
print_board()

while True:
    try:
        move = int(input(f"Player {current_player}, choose a position (1-9): ")) - 1

        if move < 0 or move > 8:
            print("Invalid position. Choose between 1 and 9.")
            continue

        if board[move] != " ":
            print("That position is already taken.")
            continue

        board[move] = current_player
        print_board()

        if check_winner(current_player):
            print(f"🎉 Player {current_player} wins!")
            break

        if is_draw():
            print("It's a draw!")
            break

        current_player = "O" if current_player == "X" else "X"

    except ValueError:
        print("Please enter a number between 1 and 9.")
