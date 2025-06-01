// Shallow Copy : A shallow copy creates a new object, but instead of copying the nested objects (e.g., lists or dictionaries) within the original object, it copies references to those nested objects
// Deep Copy : A deep copy creates a new object and recursively copies all objects found in the original object.
public class CopyConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Raghunandan", 18);
        p1.marks[0] = 60;
        p1.marks[1] = 55;
        p1.marks[2] = 58;

        Person p2 = new Person(p1);

        // Done this for illustrating deep copy
        p1.marks[2] = 60; 
        System.out.println(p2.marks[2]);
    }
}

class Person {
    String name;
    int age;
    int[] marks;

    Person(Person p1) {
        this.name = p1.name;
        this.age = p1.age;
        this.marks = new int[3]; // Doing this for deep copy of arrays as those are passed by reference
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = p1.marks[i];
        }
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = new int[3];
    }
}