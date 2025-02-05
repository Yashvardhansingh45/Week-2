// 5. Library Management System
// Description: Develop a library management system:
// Use an abstract class LibraryItem with fields like itemId, title, and author.
// Add an abstract method getLoanDuration() and a concrete method getItemDetails().
// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
// Implement an interface Reservable with methods reserveItem() and checkAvailability().
// Apply encapsulation to secure details like the borrower’s personal data.
// Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
// Superclass
abstract class LibraryItem {
//   Attributes
    private String itemId;
    private String title;
    private String author;
//  Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
// method to get info
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
// method to get loan duration
    public abstract int getLoanDuration();
}
//interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

