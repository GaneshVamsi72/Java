public class PowerOf2OrNot_BitLevel {
    public static boolean isPowerOf2(int n) {
        return ((n & (n - 1)) == 0); // if n is a power of 2, then (n & n - 1) will always be zero.
    }

    public static void main(String[] args) {
        if (isPowerOf2(8)) {
            System.out.print("It is a power of 2.");
        } else {
            System.out.print("It is not a power of 2.");
        }
    }
}