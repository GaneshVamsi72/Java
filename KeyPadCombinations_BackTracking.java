// Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order. Mapping of digits to letters == just like on the telephone buttons. Note that 1 does not map to any letters.
public class KeyPadCombinations_BackTracking {
    static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void Combinations(String str, int i, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        int digit = str.charAt(i) - '0';
        for (int j = 0; j < L[digit].length; j++) {
            Combinations(str, i + 1, ans + L[digit][j]);
        }
    }

    public static void main(String[] args) {
        String str = "23";
        Combinations(str, 0, "");
    }
}