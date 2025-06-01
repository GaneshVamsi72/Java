// Time Complexity : O(x * n) 
// x --> Largest length of a string in the array of strings
// Time Complexity of compareTo function is x !!
public class LexicographicLargestString {
    public static String LargestString(String[] fruits) {
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = { "apple", "mango", "banana" };

        System.out.println(LargestString(fruits));
    }
}