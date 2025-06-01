import java.util.Scanner;

public class FunctionsBasic {
    public static void greet() {
        System.out.println("Jai Siya Ram");
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        greet();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter b : ");
        int num2 = scanner.nextInt();

        System.out.println(add(num1, num2));

        scanner.close();
    }
}