import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 50, 70, 90 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element whose element's index is to be found : ");
        int key = scanner.nextInt();

        int key_index = linearSearch(numbers, key);
        if (key_index == -1) {
            System.out.print("Not Found.");
        } else {
            System.out.print("Index of the key element is : " + key_index);
        }
        scanner.close();
    }
}