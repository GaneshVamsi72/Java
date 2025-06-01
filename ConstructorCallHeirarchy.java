public class ConstructorCallHeirarchy {
    public static void main(String[] args) {
        Labrador Taishu = new Labrador();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Constructor called");
    }
}

class Labrador extends Dog {
    Labrador() {
        System.out.println("Labrador Constructor called");
    }
}