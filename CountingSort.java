// Sorts the elements of an array by counting the number of occurences of each unique element in the array. 
// The count is stored in an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array.
// Time Complexity : O(n + k)
// Space Complexity : O(k)
// Stable
// k is the largest element in the given array
public class CountingSort {

    public static void countingSort(int[] array) {
        // Finding maximum element 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
        }

        // Frequency array
        int[] count = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // Cumulaitve frequency array 
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[array.length];
        // Finding the index of each element of the original array in the count array and placing the each element at the correct index in the output array. 
        int index;
        for (int i = array.length - 1; i >= 0; i--) {
            index = count[array[i]] - 1;
            output[index] = array[i];
            count[array[i]]--;
        }
        
        // Copying the sorted elements into original array
        for (int i = 0; i < output.length; i++) {
            array[i] = output[i];
        }
    }

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 1, 4, 1, 3, 2, 4, 3, 7 };

        countingSort(array);
        printarray(array);
    }
}