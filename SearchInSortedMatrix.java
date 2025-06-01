/*
Start from the Top-Right or Bottom-Left Corner:

Choose either the top-right or bottom-left corner of the matrix as a starting point.
This choice is strategic because it allows you to eliminate one entire row or column in each step, depending on whether the target is greater or smaller than the current element.

Compare with the Target:

If the current element is equal to the target, you have found the element, and you can return its position.
If the target is smaller than the current element, move left to eliminate the current column (since all elements in that column are greater).
If the target is greater than the current element, move down to eliminate the current row (since all elements in that row are smaller).

Repeat Until Found or Out of Bounds:

Continue these comparisons and movements until you find the target or go out of bounds.
*/

// Time Complexity : O(n + m)
public class SearchInSortedMatrix {

    public static boolean search(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.print("Target is at " + "(" + row + ", " + col + ")");
                return true;
            } else if (target < matrix[row][col]) {
                // Move to the left
                col--;
            } else {
                // Move to the bottom
                row++;
            }
        }

        System.out.print("Target is not found.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }
        };

        int target = 5;

        search(matrix, target);
    }
}