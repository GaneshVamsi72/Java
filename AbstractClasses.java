// The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).
// Can have Constructors
public class AbstractClasses {

    public static void main(String[] args) {
        Dog Taishu = new Dog();

        Taishu.makeSound();
        Taishu.eat();

        System.out.println(Taishu.color + "(Default)");
        // Changing color
        Taishu.color = "LightBrown";
        System.out.println(Taishu.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Woof woof");
    }

    public void changeColor() {
        color = "LightBrown";
    }
}