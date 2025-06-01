// StringBuilder is a class in Java that is used to create mutable (modifiable) strings. StringBuilder is used when we want to modify a string without creating a new object. It is useful when we need to concatenate many strings together in a loop, as it can boost performance.
// If we perform the following with String class, then it would be non-efficient and the Time complexity would be quadratically increasing. 
public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'A'; ch < 'Z'; ch++) {
            sb.append(ch);
        }

        System.out.print(sb);
    }
}