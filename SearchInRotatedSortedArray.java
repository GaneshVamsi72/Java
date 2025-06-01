
/*
 * Given the rotated sorted array of integers, which contains distinct elements, and an integer target, return the index of target if it is in the array.
 * Otherwise return -1.
 * Time Complexity must be O(log n) base = 2 ====> *******Only One Binary Search is allowed.!!!!!
 */

// Finding the sorted half is the key !!!!!!!
import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public static int Search(int[] nums, int t) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == t) {
                return mid;
            } else if (nums[start] <= nums[mid]) { // ==> start to mid is definitely sorted part
                if (nums[start] <= t && nums[mid] > t) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // ==> mid to end is definitely sorted part
                if (nums[mid] < t && nums[end] >= t) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter t : ");
        int t = scanner.nextInt();
        int t_i = Search(nums, t);

        if (t_i != -1) {
            System.out.print(t_i);
        } else {
            System.out.print("Target not found.");
        }
        scanner.close();
    }
}
