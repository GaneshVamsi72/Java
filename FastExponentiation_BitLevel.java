// Not had feel!
// Time Complexity : O(log n) (Base of the logarithm is 2)
public class FastExponentiation_BitLevel {
    public static int FastExpo(int a, int n) {
        int ans = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(FastExpo(3, 5));
    }
}