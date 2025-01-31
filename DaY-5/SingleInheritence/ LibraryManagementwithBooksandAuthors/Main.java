// Sample Problem 1: Library Management with Books and Authors
// Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:
// Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.
// Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
// Class Main
class Main{
    public static void main(String []args ){
//        create object
        Book author=new Author("JAVA", 2020,"Oracle","BIO not found");
//        call methods
        author.displayInfo();
    }
}