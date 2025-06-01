// Reason : In the worst case scenario we have to explore all possible combinations of queen placements. 
// So for placing first queen in the first row, there are n choices and the number of choices will reduce by 1 for the next queen...
// Therefore, n*n-1*n-2...... will lead to O(n!)
// Approach written in the notes!!!!!

public class NQueens_BackTracking {
    static int possibleWays = 0;

    public static boolean isSafe(char[][] board, int row, int col) {

        // Checking in the upside column of the current Queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Checking in the upside left diagonal of the current Queen
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Checking in the upside right diagonal of the current Queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // O(n * n!)
    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            possibleWays++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    // Function for finding whether there is a possible solution or not and if possible it will allow us to print one possible solution

    // public static boolean nQueens(char[][] board, int row) {
    //     if (row == board.length) {
    //         for (int i = 0; i < board.length; i++) {
    //             for (int j = 0; j < board.length; j++) {
    //                 System.out.print(board[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();

    //         possibleWays++;
    //         return true;
    //     }
    //
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row + 1)) {
    //                  return true;                    
    //             }
    //             board[row][j] = 'x';
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);

        System.out.println("Number of possible ways : " + possibleWays);
    }
}