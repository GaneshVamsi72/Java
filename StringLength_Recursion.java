public class StringLength_Recursion {
    public static int strlen(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return 1 + strlen(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(strlen("SitaRam"));
    }
}