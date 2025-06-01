// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Stable
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Compare key with each element on the left of it until an element smaller than key is found.
            // For descending order, change key < arr[j] to key > arr[j].
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at after the element just smaller than the key.
            arr[j + 1] = key;
        }
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        insertionSort(arr);
        printarr(arr);
    }
}