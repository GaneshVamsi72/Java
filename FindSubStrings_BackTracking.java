// Similar to BinaryStringsProblem !!!
// Time Complexity : O(n * (2^n))
// Reason : For finding each substring total n characters were asked whether they're in or out!!! And we have to find 2^n substrings 
// Space Complexity : O(n)

public class FindSubStrings_BackTracking {

    public static void PrintSubStrings(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Possible Substrings when the current character is taken
        PrintSubStrings(str, i + 1, ans + str.charAt(i));

        // Possible SubStrings when the current character is not taken
        PrintSubStrings(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";

        PrintSubStrings(str, 0, "");
    }
}