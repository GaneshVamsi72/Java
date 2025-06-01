import java.util.Scanner;

public class BinaryToDecimal {
    public static int decimal(int n) {
        int decimal = 0;
        int i = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * (int) Math.pow(2, i);
            n /= 10;
            i++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary number : ");
        int binary = scanner.nextInt();

        System.out.print("Decimal number : " + decimal(binary));
        scanner.close();
    }
}