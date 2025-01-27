// Problem 1: Library and Books (Aggregation)
// Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books,
// but a book can exist independently (outside of a specific library).
// Tasks:
// Define a Library class with an ArrayList of Book objects.
// Define a Book class with attributes such as title and author.
// Demonstrate the aggregation relationship by creating books and adding them to different libraries.
// Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
public class Book{
    //attributes
    private String title;
    private String author;
    //constructors
    Book(String title, String author){
        this.title = title;
        this.author= author;
    }
    // method to get title
    public String getTitle(){
        return title;
    }
    // method to get Author
    public String getAuthor(){
        return author;
    }

    // Override toString for clean printing
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}