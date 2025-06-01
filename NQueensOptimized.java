// Watch Striver !

// Time Complexity : O(n!)

import java.util.Arrays;

public class NQueensOptimized {
    static void placeQueens(char[][] board, int r, int n, boolean[] colUsed, boolean[] leftDiagUsed, boolean[] rightDiagUsed) {
        if (r == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            return;
        }

        for (int c = 0; c < n; c++) {
            if (!colUsed[c] && !leftDiagUsed[n - 1 + c - r] && !rightDiagUsed[r + c]) {
                board[r][c] = 'Q';
                colUsed[c] = true;
                leftDiagUsed[n - 1 + c - r] = true;
                rightDiagUsed[r + c] = true;

                placeQueens(board, r + 1, n, colUsed, leftDiagUsed, rightDiagUsed);

                board[r][c] = 'x';
                colUsed[c] = false;
                leftDiagUsed[n - 1 + c - r] = false;
                rightDiagUsed[r + c] = false;
            }
        }
    }

    static void nQueen(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], 'x');
        }

        boolean[] colUsed = new boolean[n]; // To check columns
        boolean[] leftDiagUsed = new boolean[2 * n]; // To check left diagonals (i - j + n - 1)
        boolean[] rightDiagUsed = new boolean[2 * n]; // To check right diagonals (i + j)

        placeQueens(board, 0, n, colUsed, leftDiagUsed, rightDiagUsed);
    }
    
    public static void main(String[] args) {
        int n = 4;

        nQueen(n);
    }
}
