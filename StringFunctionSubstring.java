public class StringFunctionSubstring {

    public static String substring(String str, int start, int end) {
        String substring = "";

        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }

        return substring;
    }

    public static void main(String[] args) {
        String str = "Siya ke Ram";
        // By user defined function
        System.out.print(substring(str, 0, 4));
        // By built-in function
        System.out.print(str.substring(8, 11));
    }
}
