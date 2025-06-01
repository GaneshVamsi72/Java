public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1 = new Book(75);
        Book b2 = new Book(60);
        System.out.println(Book.count); // Static variable can directly be accessed with class name.
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}