public class Inheritance {
    public static void main(String[] args) {

        System.out.println("***Taishu***");

        // create an object of the subclass
        Dog Taishu = new Dog();

        // access field and method of subclass
        Taishu.name = "Taishu";
        Taishu.display();

        // call method of superclass
        // using object of superclass
        Taishu.eat();

        System.out.println("***Senku***");

        Labrador lab = new Labrador();

        lab.human();

        lab.name = "Senku";
        lab.display();

        lab.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal { // Single Inheritance
    String name;

    public void display() {
        System.out.println("My name is : " + name);
    }
}

class Labrador extends Dog { // MultiLevel Inheritance
    public void human() {
        System.out.println("I love humans.");
    }
}