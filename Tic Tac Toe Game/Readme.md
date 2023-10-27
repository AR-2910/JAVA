# **Project Title: Tic-Tac-Toe Game**

**Project Description:**

The "Tic-Tac-Toe Game" is a Java-based console application that allows two players to play the classic game of Tic-Tac-Toe. In this game, two players, represented as 'X' and 'O', take turns to mark their respective symbols on a 3x3 grid. The goal is to be the first to form a line of three of their symbols, either horizontally, vertically, or diagonally.

**Key Concepts and Components:**

**Board Initialization:** The project starts by initializing a 3x3 game board represented as a 2D array. The board is filled with empty spaces to begin the game.

**Player Turns:** The game alternates between two players, 'X' and 'O'. It uses a char variable (player) to keep track of the current player.

**Input Handling:** The Scanner class is used to handle user input. Players are prompted to enter their move by specifying the row and column where they want to place their symbol.

**Game Logic:** The core game logic is implemented in the while loop. Players take turns to make a move, and the program checks the validity of the move. If a move is valid (the chosen cell is empty), the program updates the board with the player's symbol.

**Winning Condition:** The haveWon method checks for winning conditions. It verifies if a player has achieved a winning combination either horizontally, vertically, or diagonally. If a winning combination is found, the game is declared as won by the respective player.

**Print Board:** The printBoard method is responsible for displaying the current state of the game board on the console.

**How to Play:**

1. Run the program.
2. Players 'X' and 'O' take turns entering their moves. Enter the row and column where you want to place your symbol, separated by spaces.
3. The game will continue until one player wins or it ends in a draw.

**Concepts Demonstrated:**

- 2D Arrays: The game board is represented as a 2D array.
- User Input Handling: The program uses the Scanner class to read user input.
- Game Logic: It demonstrates basic game logic, including turn-taking, checking for winning conditions, and handling invalid moves.
- Conditional Statements: Conditional statements (if-else) are used to determine if a move is valid and to switch players.
- Loops: A while loop is used to control the flow of the game until it ends.
