// 5. Library Management System
// Description: Develop a library management system:
// Use an abstract class LibraryItem with fields like itemId, title, and author.
// Add an abstract method getLoanDuration() and a concrete method getItemDetails().
// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
// Implement an interface Reservable with methods reserveItem() and checkAvailability().
// Apply encapsulation to secure details like the borrower’s personal data.
// Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
// Subclass

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}