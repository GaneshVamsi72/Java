// Prefix Sum Method
// Time Complexity : O(n^2)
// Space Complexity : O(n)
public class MaxSubArraySum2 {
    public static void maxSubarraySum(int[] arr) {
        // prefix array
        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int curr_sum = 0;
                if (i == 0) {
                    curr_sum = prefixArray[j];
                    System.out.print(curr_sum + " ");
                } else {
                    curr_sum = prefixArray[j] - prefixArray[i - 1];
                    System.out.print(curr_sum + " ");
                }
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }

        System.out.println();
        System.out.print("Max SubArraySum is : " + max_sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        maxSubarraySum(arr);
    }
}