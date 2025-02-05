// 5. Library Management System
// Description: Develop a library management system:
// Use an abstract class LibraryItem with fields like itemId, title, and author.
// Add an abstract method getLoanDuration() and a concrete method getItemDetails().
// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
// Implement an interface Reservable with methods reserveItem() and checkAvailability().
// Apply encapsulation to secure details like the borrower’s personal data.
// Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
//Main class

class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Java Basics", "John Doe");
        LibraryItem magazine = new Magazine("M001", "Tech Today", "Jane Doe");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        book.getItemDetails();
        System.out.println("Loan duration: " + book.getLoanDuration() + " days");
        ((Reservable) book).reserveItem();

        magazine.getItemDetails();
        System.out.println("Loan duration: " + magazine.getLoanDuration() + " days");
        ((Reservable) magazine).reserveItem();

        dvd.getItemDetails();
        System.out.println("Loan duration: " + dvd.getLoanDuration() + " days");
        ((Reservable) dvd).reserveItem();
    }
}