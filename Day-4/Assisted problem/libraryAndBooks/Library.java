// Problem 1: Library and Books (Aggregation)
// Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books,
// but a book can exist independently (outside of a specific library).
// Tasks:
// Define a Library class with an ArrayList of Book objects.
// Define a Book class with attributes such as title and author.
// Demonstrate the aggregation relationship by creating books and adding them to different libraries.
// Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
import java.util.ArrayList;
import java.util.List;

public class Library {
    // Attributes
    private String libraryName;
    private List<Book> books;

    // constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // method to add books
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to " + libraryName);
    }

    // method to show books
    public void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }
}