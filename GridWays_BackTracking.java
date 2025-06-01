// If can't understand then check the Maze path program in C folder
// Only moving down or right is allowed
// Recursion Tree:
// The recursion tree has a branching factor of 2 (right or down).
// The maximum depth of the tree is n + m - 2 (since we start from (0, 0) and need to reach (n-1, m-1)).
// Time Complexity:
// The time complexity is determined by the number of recursive calls made.
// The total number of recursive calls is proportional to the size of the recursion tree.
// Therefore, the time complexity is exponential in terms of n and m.
// Specifically, it is O(2^(n+m)).
public class GridWays_BackTracking {
    public static int GridWays(int x, int y, int n, int m) {
        if (x == n - 1 && y == m - 1) {
            return 1;
        } else if (x == n || y == m) { // Out of the Grid
            return 0;
        }

        return GridWays(x + 1, y, n, m) + GridWays(x, y + 1, n, m); // Ways(n, m - 1) == Ways after taking right step and Ways(n - 1, m) == Ways after taking down step
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(GridWays(0, 0, n, m));
    }
}
// The solution can be found with linear Time Complexity O(n + m) by using math formula of permutation of alike things.
// For more details check the screenshot on 07-04-2024