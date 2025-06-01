public class TypeCasting {
    public static void main(String[] args) {
        float a = 36.97f;
        // int b = a; --> This would raise an error due to lossy conversion from float to int and hence we use Type casting
        int b = (int)a;

        System.out.println(b);

        char ch = 'a';
        int value = (int)ch; // // ASCII Value
    
        System.out.print(value);
    }
}