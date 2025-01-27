class Book {
    public String ISBN;          // Public
    protected String title;      // Protected
    private String author;       // Private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to access and modify author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Display EBook Details
    void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book("123-456", "Java Basics", "John Doe");
        System.out.println("Author: " + book.getAuthor());
        book.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book.getAuthor());

        EBook eBook = new EBook("789-012", "Advanced Java", "Alice");
        eBook.displayDetails();
    }
}
