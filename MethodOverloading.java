// Compile Time Polymorphism 
public class MethodOverloading {

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.display();
        System.out.println();
        pattern.display('#');
    }
}

class Pattern {
    void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}