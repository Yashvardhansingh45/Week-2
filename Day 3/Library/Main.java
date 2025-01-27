public class Main {
    public static void main(String[] args) {
        
        // create an object of the Library class
        Library book1 = new Library(1234, "Java Programming", "James Gosling");
        Library book2 = new Library(5678, "Python Programming", "John Smith");

        // call the display method
        book1.display();
        book2.display();

        // call the static method
        Library.displayLibraryName("Library of Congress");
    }
}
