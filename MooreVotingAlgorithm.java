// Given an array nums of size n, return the majority element . The majority element is the element that appears more than ⌊n/2⌋ times. You may assume that the majority element always exists in the array.
// Sample Input 1: nums = [3,2,3]
// Sample Output 1: 3
// Sample Input 2: nums = [2,2,1,1,1,2,2]
// Sample Output 2: 2
// Constraints(extra Conditions): 
// n == nums.length
// 1 <= n <= 5 * 104 
// -109 <= nums[i] <= 109
// One very nice approach having Time Complexity O(n * log n) is as follows :
// *****As the majority element appears more than the size of half of the array, it always passes the mid of the array when the array is sorted using Quick Sort/ Merge Sort  

// Moore's Voting Algorithm Illustration : 
public class MooreVotingAlgorithm {

    public static void main(String[] args) {
        int[] num = { 2, 2, 1, 3, 1, 2, 2 };

        int majority = num[0];
        int votes = 1;

        for (int i = 1; i < num.length; i++) {
            if (votes == 0) {
                votes++;
                majority = num[i];
            } else if (majority == num[i]) {
                votes++;
            } else {
                votes--;
            }
        }

        System.out.println(majority);
    }
}