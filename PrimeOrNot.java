import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        if (isPrime(n) == true) {
            System.out.print("The number is a prime number.");
        } else {
            System.out.print("The number is not a prime number.");
        }

        scanner.close();
    }
}