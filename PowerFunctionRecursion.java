// TimeComplexity : O(log n)
public class PowerFunctionRecursion {
    public static int exp(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int halfpower = exp(x, n / 2);
            return halfpower * halfpower;
        } else {
            return x * exp(x, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(exp(2, 10));
    }
}