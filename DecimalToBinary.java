import java.util.Scanner;

public class DecimalToBinary {
    public static int binary(int n) {
        int binary = 0;
        int i = 0;
        while (n != 0) {
            int remainder = n % 2;
            binary += remainder * (int) Math.pow(10, i);
            n /= 2;
            i++;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = scanner.nextInt();

        System.out.print("Binary number : " + binary(decimal));
        scanner.close();
    }
}
