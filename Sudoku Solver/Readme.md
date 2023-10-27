# **Sudoku Solver**

**Project Description**

The "Sudoku Solver" is a Java program designed to solve Sudoku puzzles using a backtracking algorithm. Sudoku is a popular number puzzle where the goal is to fill a 9x9 grid divided into 3x3 subgrids with numbers from 1 to 9, ensuring that no number repeats in any row, column, or subgrid.

**Key Concepts and Components**

- **Sudoku Grid**: The project initializes a 9x9 Sudoku grid represented as a 2D integer array. Some cells are pre-filled, while others are left empty for solving.
- **Backtracking Algorithm**: The core of the project is a backtracking algorithm that efficiently explores different possibilities to find a solution to the Sudoku puzzle.
- **Recursive Solving**: The solver employs a recursive approach, attempting to place numbers and calling itself to solve the remaining cells.
- **Safety Check**: The `issafe` function ensures it's safe to place a number in a given cell, adhering to Sudoku rules.
- **Display Function**: The display function prints the solved Sudoku grid, making it visible to the user.

**How to Use**

1. Define the Sudoku puzzle by initializing the `board` array, where '0' represents an empty cell.
2. Run the program, and it will attempt to solve the Sudoku puzzle.
3. If a solution is found, it will be displayed on the console. If not, it will indicate that the puzzle is unsolvable.

**Concepts Demonstrated**

- **Backtracking Algorithm**: The project demonstrates a backtracking algorithm to efficiently solve complex puzzles.
- **Recursion**: The recursive approach is used for solving the Sudoku puzzle.
- **Array Manipulation**: A 2D array is used to represent the Sudoku grid.
- **Problem Solving**: The project showcases problem-solving skills and logical thinking.


