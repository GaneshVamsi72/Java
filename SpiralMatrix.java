// Not completely the code is clear 
// Should be cleaned and modified 
// Still Works correctly!!

// Approach : Think of outline of matrix and shrinking matrix type.

public class SpiralMatrix {
    public static void Spiral(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        int StartR = 0, EndR = n - 1, StartC = 0, EndC = m - 1;

        // Startrow is top ; Endrow is bottom ;
        // Startcolumn is left ; Endcolumn is right ;

        int count = 0, total = n * m;

        while (count < total) {
            for (int j = StartC; j <= EndC && count <= total; j++) {
                System.out.print(matrix[StartC][j] + " ");
                count++;
            }
            StartR++;

            for (int i = StartR; i <= EndR && count <= total; i++) {
                System.out.print(matrix[i][EndC] + " ");
                count++;

            }
            EndC--;

            for (int j = EndC; j >= StartC && count <= total; j--) {
                System.out.print(matrix[EndR][j] + " ");
                count++;

            }
            EndR--;

            for (int i = EndR; i >= StartR && count <= total; i--) {
                System.out.print(matrix[i][StartC] + " ");
                count++;

            }
            StartC++;
        }
    }

    public static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 8, 2, 6, 5 }, { 3, 1, 4, 0 }, { 7, 9, 7, 3 }, { 0, 7, 8, 3 } };

        PrintMatrix(matrix);
        Spiral(matrix);
    }
}