public class StringFunctionCompare {

    public static void main(String[] args) {
        String str1 = "Raghunandan";
        String str2 = "Raghunandan";

        String str3 = new String("Raghunandan");

        if (str1 == str2) {
            System.out.println("str1 and str2 are same.");
        } else {
            System.out.println("str1 and str2 are not same.");
        }

        if (str1 == str3) {
            System.out.println("str1 and str3 are same.");
        } else {
            System.out.println("str1 and str3 are not same.");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are same.");
        } else {
            System.out.println("str1 and str3 are not same.");
        }
    }
}