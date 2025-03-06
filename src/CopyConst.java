
// Book class with Copy Constructor
class Book {
    String title;
    String author;
    double price;

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy Constructor
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    // Display Method
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }
}

// Main Class
public class CopyConst {
    public static void main(String[] args) {
        // Creating an original book object
        Book book1 = new Book("Java Programming", "Aryan", 30.5);

        // Creating a new book object using the copy constructor
        Book book2 = new Book(book1);

        // Displaying book details
        System.out.println("Original Book Details:");
        book1.display();

        System.out.println("\nCopied Book Details:");
        book2.display();
    }
}
