//Program to Handle Book Details
//Problem Statement: Write a program to create a Book class with attributes title, author, and price.
// Add a method to display the book details.
public class Book{
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor
    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // method to display the book details
    void displayBook(){
        System.out.println("Title of the book is: " + title);
        System.out.println("Author of the book is:" + author);
        System.out.println("Price of the book is: "+ price);
    }
}