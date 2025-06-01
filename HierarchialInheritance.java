public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog Taishu = new Dog();

        Taishu.display();
        Taishu.eat();

        Cat Senku = new Cat();
        
        Senku.display();
        Senku.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("Meow!");
    }
}

class Cat extends Animal {
    public void display() {
        System.out.println("Woof Woof!");
    }
}