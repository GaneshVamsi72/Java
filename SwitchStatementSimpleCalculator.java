import java.util.Scanner;

public class SwitchStatementSimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Perform any of the four fundamental operations here....");
        System.out.print("Enter first operand : ");
        float a = scanner.nextFloat();
        System.out.print("Enter second operand : ");
        float b = scanner.nextFloat();
        System.out.print("Enter an operator : ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.print("Invalid Input.");
                break;
        }

        scanner.close();
    }
}