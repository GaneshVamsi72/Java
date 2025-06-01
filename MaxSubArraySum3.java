// Kadane's Algorithm
// Main point : If currSum becomes negative, it is reset to zero because we don’t want to include negative-sum values in our subarray 
// Time Complexity : O(n)
// Space Complexity : O(1)
public class MaxSubArraySum3 {
    public static void maxSubarraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int currSum = 0;
        for (int num : arr) {
            currSum += num;
            
            if (currSum > maxSoFar) {
                maxSoFar = currSum;
            }

            if (currSum < 0) { // Regards the main point
                currSum = 0;
            }
        }
        System.out.print("Max Subarray Sum is : " + maxSoFar);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        maxSubarraySum(arr);
    }
}
