import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        // Three ways of declaring an array

        String[] array = new String[3];

        double[] data;
        data = new double[10];

        int[] age = { 12, 4, 5, 2, 5 };

        // Input of an array

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter name " + (i + 1) + " : ");
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Name " + (i + 1) + " : " + array[i]);
        }

        scanner.close();
    }
}