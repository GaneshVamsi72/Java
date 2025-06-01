// ** Strings are IMMUTABLE **

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String str1 = "Siya";
        String str2 = new String("Ram");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str3 = scanner.nextLine();

        System.out.println(str3);

        String str = str1 + " " + str2;
        System.out.println(str);
        System.out.println(str.length());
        System.out.print(str.charAt(5));

        scanner.close();
    }
}