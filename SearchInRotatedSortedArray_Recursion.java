
// Check normal code to understand this code
// Time Complexity : O() ??????????????????????
// Shraddha didi concept
// First Plot the array elements.. The result will be two slanted lines
// Mid element will either lie on L1 or L2
import java.util.Scanner;

public class SearchInRotatedSortedArray_Recursion {

    public static int Search(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = (s + e) / 2;
        if (arr[m] == t) {
            return m;
        }

        if (arr[s] <= arr[m]) { // Mid on L1
            // Applying Binary Search accordingly
            if (arr[s] <= t && t <= arr[m]) { // Searching in left part 
                return Search(arr, t, s, m - 1);
            } else { // Searching in right part containing L1 & L2
                return Search(arr, t, m + 1, e);
            }
        } else { // Mid on L2
            // Applying Binary Search accordingly
            if (arr[m] <= t && t <= arr[e]) { // Searching in right part
                return Search(arr, t, m + 1, e);
            } else { // Searching in left part containing L1 & L2
                return Search(arr, t, s, m - 1);
            }
        }
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

        int t_i = Search(nums, t, 0, nums.length - 1);

        if (t_i != -1) {
            System.out.print(t_i);
        } else {
            System.out.print("Target not found.");
        }
        scanner.close();
    }
}
