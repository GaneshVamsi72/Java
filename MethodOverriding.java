// Run-Time Polymorphism
public class MethodOverriding {
    public static void main(String[] args) {
        Java j1 = new Java();
        j1.displayInfo();

        Language L1 = new Language();
        L1.displayInfo();
    }
}

class Language {
    void displayInfo() {
        System.out.println("Common English Language.");
    }
}

class Java extends Language {
    void displayInfo() {
        System.out.println("Java Programming Language.");
    }
}