/*  Approach:

In binary, even numbers always end in 0, and odd numbers end in 1.
Use the bitwise AND operator (`&`) to check the LSB of the binary representation.
The expression `(num & 1)` extracts the value of the least significant bit.
If the result of `(num & 1)` is 0, the number is even because the LSB is 0.
If the result is 1, the number is odd because the LSB is 1.

*/

// This approach efficiently determines whether a number is odd or even without explicitly converting it to binary and looking at the LSB. Instead, it leverages the bitwise AND operator for a quick check.

public class OddOrEvenBitLevel {
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        int n = 3;

        if (isEven(n)) {
            System.out.print("Even number.");
        } else {
            System.out.print("Odd number.");
        }
    }
}