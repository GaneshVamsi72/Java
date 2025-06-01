// Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles.
// A tile can either be placed horizontally or vertically.
// Similar to mazepath problem
public class TilingProblem {
    public static int tiling(int n) {
        if (n <= 1) {
            return 1;
        }
        int ans = tiling(n - 1) + tiling(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}