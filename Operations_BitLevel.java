// Must dry run for understanding the logic.
// Every step must be written on paper.
// Finding bitMask is also important.
public class Operations_BitLevel {
    public static int GetIthBit(int n, int i) { // For knowing the value of bit at particular position.
        if ((n & (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetIthBit(int n, int i) { // For changing the value of bit at particular position to 1.
        return (n | (1 << i));
    }

    public static int ClearIthBit(int n, int i) { // For changing the value of bit at particular position to 0.
        return (n & (~(1 << i)));
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        /*
         * Simple Approach :
         * if (newBit == 0) {
         * return ClearIthBit(n, i);
         * } else {
         * return SetIthBit(n, i);
         * }
         */
        n = ClearIthBit(n, i);
        return (n | (newBit << i));
    }

    public static int ClearLastIBits(int n, int i) {
        return (n & ((~0) << i));
    }

    public static int ClearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1); // 2 ^ i == 1 << i; // For b , we should observe the pattern.
        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(GetIthBit(10, 3));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateIthBit(10, 2, 1));
        System.out.println(ClearLastIBits(15, 2));
        System.out.println(ClearRangeOfBits(10, 2, 4));
    }
}