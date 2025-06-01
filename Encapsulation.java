// In Java, encapsulation helps us to keep related fields and methods together, which makes our code cleaner and easy to read.
// This also helps to achieve data hiding.

public class Encapsulation {
    public static void main(String[] args) {
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Eshwar");
        System.out.println(d.getName());
    }
}

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
}