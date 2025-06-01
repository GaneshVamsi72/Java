// Time Complexity : O(n * log n) 
// Space Complexity : O(n)
public class MergeSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int s, int m, int e) {
        // temporary array for combining the subarrays in sorted fashion
        int[] temp = new int[e - s + 1];

        // indices for left and right subarrays
        int i = s;
        int j = m + 1;

        // Index for temp array
        int k = 0;

        // Merging
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // getting remaining elements of left subarray if any
        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // getting remaining elements of right subarray if any
        while (j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copying the elements of temp
        int x = s;
        for (k = 0; k < temp.length; k++) {
            arr[x] = temp[k];
            x++;
        }
    }

    public static void sort(int[] arr, int s, int e) {
        if (s == e) {
            return;
        }
        // middle point
        int m = s + (e - s) / 2;

        // Sort left and right halves
        sort(arr, 0, m);
        sort(arr, m + 1, e);

        // merge sorted halves
        merge(arr, s, m, e);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };

        System.out.println("Given array : ");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array : ");
        printArray(arr);
    }
}