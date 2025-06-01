public class Swap_BitLevel {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.print("Before swap :\nx = " + x + " y = " + y);
        System.out.println();
        // Swapping using XOR operator
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.print("After swap :\nx = " + x + " y = " + y);
    }
}
