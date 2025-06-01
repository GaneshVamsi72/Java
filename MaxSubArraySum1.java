// Brute Force Method
// Time Complexity : O(n^3) 
// Space Complexity : O(1)
public class MaxSubArraySum1 {

    public static void maxSubarraySum(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int curr_sum = 0;
                for (int k = i; k <= j; k++) {
                    curr_sum += arr[k];
                }
                System.out.print(curr_sum + " ");
                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println();
        System.out.print("Max sum : " + max_sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        maxSubarraySum(arr);
    }
}