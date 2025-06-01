// ******Not Clear (Two Pointer Approach)
// Watch Striver's solution
// Take the help of GPT chat on 25th Jan 2025
// Derived based on the fact that everytime only min boundary is the main thing for the calculation of the water trapped above that index.
public class TrappingRainWater2 {
    public int trap(int[] height) {
        int left = 0; // Pointer to the left wall.
        int right = height.length - 1; // Pointer to the right wall.
        int leftMax = 0; // Maximum height to the left of the left pointer.
        int rightMax = 0; // Maximum height to the right of the right pointer.
        int trappedWater = 0; 

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        TrappingRainWater2 solution = new TrappingRainWater2();
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = solution.trap(height);
        System.out.println("Trapped water: " + result);
    }
}
