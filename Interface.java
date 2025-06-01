// An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
public class Interface {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}

interface Language {
    void getName(String Name);
}

class ProgrammingLanguage implements Language {
    public void getName(String name) {
        System.out.println("Programming Language : " + name);
    }
}