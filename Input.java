import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your nickname : ");
        String nickname = scanner1.next();
        System.out.println(nickname);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner2.nextLine();
        System.out.println(name);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = scanner3.nextInt();
        System.out.println(x);

        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
