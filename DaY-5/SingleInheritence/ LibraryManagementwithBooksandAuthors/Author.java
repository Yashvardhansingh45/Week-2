// Sample Problem 1: Library Management with Books and Authors
// Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:
// Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.
// Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
class Author extends Book{
//    Attributes
    private String name;
    private String bio;
//    Constructor
    Author(String title, int publicationYear, String name, String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
//    method to display details
    void displayInfo(){
        super.displayInfo();
        System.out.println("Name of the Author is: "+ name +" ,bio: "+ bio);
    }
}