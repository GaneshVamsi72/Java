// Time Complexity : O(n)
// Space Complexity : O(n)
public class TrappingRainWater1 {
    public static int TrappedWater(int[] height, int width) {
        int n = height.length;

        // Creating arrays of left max & right max boundaries for every element of
        // height

        int[] left_max = new int[n];
        left_max[0] = height[0];
        int[] right_max = new int[n];
        right_max[n - 1] = height[n - 1];

        for (int i = 1, j = n - 2; (i < n && j >= 0); i++, j--) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
            right_max[j] = Math.max(height[j], right_max[j + 1]);
        }

        // Calculation of water trapped for every element of height
        int result = 0;

        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            int water_trapped = (water_level - height[i]) * width;
            result += water_trapped;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;
        System.out.println("Trapped water = " + TrappedWater(height, width));
    }
}