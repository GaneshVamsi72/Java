import java.util.Scanner;

public class Arrays_2D {

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        int rows = matrix.length, columns = matrix[0].length;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element " + i + ", " + j + " : ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}