and availability. Implement a method to borrow a book.
class LibraryBook {
    // Attributes
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Default Constructor
    LibraryBook() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        isAvailable = true;
    }

    // Parameterized Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Borrow Method
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    // Display Book Details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
    public static void main(String[] args) {
        // Parameterized Constructor
        LibraryBook book = new LibraryBook("1984", "George Orwell", 15.99);
        book.displayBookDetails();

        // Borrow the Book
        book.borrowBook();
        book.displayBookDetails();
    }
}