// Average Case Time Complexity : O(n *log n)
// Space Complexity : O(1)
// Worst Case Time Complexity : O(n^2)  --> When sorted cases are given... in which the pivot element will always be smallest or largest one
public class QuickSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot, places the pivot element at its
    // correct position in sorted array, and places all smaller to left of pivot and
    // all greater elements to right of pivot
    public static int partition(int[] arr, int s, int e) {
        // Choosing the pivot
        int pivot = arr[e];

        // Index of smaller element...and indicates the right position of pivot found so far
        int i = s - 1;

        for (int j = s; j < e; j++) {
            // If current element is smaller than the pivot
            if (arr[j] <= pivot) {
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, e);
        return (i + 1);
    }

    public static void quicksort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        // pi is partitioning index, arr[p] is now at right place
        int p = partition(arr, s, e);

        // Separately sort elements before partition and after partition
        quicksort(arr, s, p - 1);
        quicksort(arr, p + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5 };
        System.out.println("Given array : ");
        printArray(arr);
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted array : ");
        printArray(arr);
    }
}