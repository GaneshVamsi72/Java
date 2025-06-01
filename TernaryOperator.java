import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        // Syntax : condition ? expression 1 : expression 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        float marks = scanner.nextFloat();

        String result = (marks >= 33) ? "passed" : "failed";

        System.out.print("You " + result + " the exam.");
        
        scanner.close();
    }
}