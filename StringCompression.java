// The time complexity of the given code is O(n), where n is the length of the input string.

// The code iterates through the input string once and performs a constant number of operations for each character in the string.

public class StringCompression {
    public static String Compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.print(Compress(str));
    }
}