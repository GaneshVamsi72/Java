import java.util.Arrays; // For functions used in sorting arr1, arr2 in different types
import java.util.Collections;

public class InbuiltSort {

    public static void printarr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Ascending order sorting

        int[] arr1 = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr1); // Time Complexity : O(n * log(n))
        printarr(arr1);

        int[] arr2 = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr2, 1, 4);
        printarr(arr2);

        // Descending order sorting

        Integer[] arr3 = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr3, Collections.reverseOrder());
        printarr(arr3);

        Integer[] arr4 = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr4, 1, 4, Collections.reverseOrder());
        printarr(arr4);
    }
}