// Problem 1: Library and Books (Aggregation)
// Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books,
// but a book can exist independently (outside of a specific library).
// Tasks:
// Define a Library class with an ArrayList of Book objects.
// Define a Book class with attributes such as title and author.
// Demonstrate the aggregation relationship by creating books and adding them to different libraries.
// Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
class Main{
    public static void main(String []args){
        // creating object for Library class
        Library Lib = new Library("Snow Library");
        // create object for book class
        Book Book1= new Book("UNknown","jjj");
        Book Book2= new Book("war","tiger");

        // call the methods
        Lib.addBook(Book1);
        Lib.addBook(Book2);

        // Display books in each library
        Lib.showBooks();

        // Books exist independently of libraries
        System.out.println("\nBook details (independent of libraries):");
        System.out.println(Book1);
        System.out.println(Book2);
    }
}