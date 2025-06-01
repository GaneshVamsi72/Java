public class SuperKeyword {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Name : " + dog.name); // Default name
    }
}

class Animal {
    String name;

    Animal() {
        System.out.println("Animal Constructor called.");
    }
}

class Dog extends Animal {
    Dog() {
        super.name = "Taishu";
        System.out.println("Dog Constructor called.");
    }
}