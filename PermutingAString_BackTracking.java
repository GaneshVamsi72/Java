// Time Complexity : O(n * n!)
// Reason : For n! permutations, we have to go through n characters of the string
public class PermutingAString_BackTracking {
    public static void Permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char curr = str.charAt(j);

            Permute(str.substring(0, j) + str.substring(j + 1), ans + curr);

            // str.substring(0, j) + str.substring(j + 1);
            // Passing the string in which the character (at the index j) being used is excluded!!!
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Permute(str, "");
    }
}