public class RemoveDuplicatesInAString {
    public static void removeDuplicates(String str, int i, StringBuilder newstr, boolean[] map) {
        if (i == str.length()) {
            System.out.println(newstr);
            return;
        }
        if (map[str.charAt(i) - 'a'] != true) {
            newstr.append(str.charAt(i));
            map[str.charAt(i) - 'a'] = true;
        }
        removeDuplicates(str, i + 1, newstr, map);
    }

    public static void main(String[] args) {
        removeDuplicates("raghunandan", 0, new StringBuilder(""), new boolean[26]);
    }
}