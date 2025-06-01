
// In the problem statement, there must be Sorted Arrays given
// Time Complexity is O(log n) (Base of the logarithm is 2)
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element whose index is to be found : ");
        int key = scanner.nextInt();

        int key_i = binarySearch(arr, key);
        if (key_i != -1) {
            System.out.print("Index of the given element : " + key_i);
        } else {
            System.out.print("Not found!");
        }
        scanner.close();
    }
}