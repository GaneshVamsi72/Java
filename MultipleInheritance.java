// Java doesn't directly support multiple inheritance.
// Interfaces provide a way to achieve similar functionality. (Multiple Inheritance)
public class MultipleInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.walk();
    }
}

interface Swimmer {
    void swim();
}

interface Walker {
    void walk();
}

class Duck implements Swimmer, Walker {
    public void swim() {
        System.out.println("Duck can swim.");
    }

    public void walk() {
        System.out.println("Duck can walk.");
    }
}