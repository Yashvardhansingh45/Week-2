class Book{
    // Att1ributes
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String title, Strng author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display Book Details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

    public static void main(String[] args) {
        // Default Constructor
        Book book1 = new Book();
        System.out.println("Book 1:");
        book1.displayBookDetails();

        // Parameterized Constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 19.99);
        System.out.println("\nBook 2:");
        book2.displayBookDetails();
}