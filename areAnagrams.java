// Can be solved in O(n) using HashMap of Characters and their Frequencies
import java.util.Arrays;

public class areAnagrams {

    public static void main(String[] args) {
        String str1 = "sitaram";
        String str2 = "RAMSITA";

        // Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // Sort the char arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sorted char arrays are same or identical then the strings are anagrams of each other.
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.print("They are anagrams of each other.");
            } else {
                System.out.print("They are not anagrams of each other.");
            }
        } else {
            // Case when lengths are not equal.
            System.out.print(str1 + " and " + str2 + " are not anagrams of each other.");       
        }
    }
}