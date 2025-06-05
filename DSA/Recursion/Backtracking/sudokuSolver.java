package Recursion.Backtracking;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1, col = -1;
        boolean emptyLeft = false;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            if (emptyLeft) break;
        }

        // If no empty cell is found, Sudoku is solved
        if (!emptyLeft) return true;

        // Try placing numbers 1-9
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;

                if (solve(board)) return true;

                // Backtrack
                board[row][col] = 0;
            }
        }
        return false; // No valid number found
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) return false;
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) return false;
        }

        // Check 3x3 sub-grid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }
        return true;
    }
}
