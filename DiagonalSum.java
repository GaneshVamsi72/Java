public class DiagonalSum {

    public static void diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Primary Diagonal sum
            sum += matrix[i][i];

            // Secondary Diagonal sum
            if (i != n - 1 - i) { // Condition for the cases in which the matrices are of odd orders.
                sum += matrix[i][n - i - 1];
            }
        }

        System.out.print("Sum of elements in the two diagonals is : " + sum);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 8, 2, 6, 5 }, { 3, 1, 4, 0 }, { 7, 9, 7, 3 }, { 0, 7, 8, 3 } };

        diagonalSum(matrix);
    }
}