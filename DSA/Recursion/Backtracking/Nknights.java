package Recursion.Backtracking;

public class Nknights {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        Knights(board, 0, 0, n);
    }

    static void Knights(boolean [][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length) { // Base case: If we exceed the board, stop.
            return;
        }
        if (col == board.length) { // If column limit is reached, move to the next row.
            Knights(board, row + 1, 0, knights);
            return;
        }
        
        // Place the knight if it's safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Knights(board, row, col + 1, knights - 1);
            board[row][col] = false; // Backtrack
        }
        
        // Continue exploring the next cell without placing a knight
        Knights(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] moves = {
            {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
            {2, -1}, {2, 1}, {1, -2}, {1, 2}
        };
        
        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (isValid(board, newRow, newCol) && board[newRow][newCol]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    static void display(boolean [][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "K " : "X ");
            }
            System.out.println();
        }
    }
}
