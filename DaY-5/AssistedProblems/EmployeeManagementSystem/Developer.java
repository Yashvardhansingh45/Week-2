// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each,
// like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

//  Subclass Developer
class Developer extends Employee{
//    Attributes
    private String programmingLanguage;

//    Constructors
    Developer(String name, int id , double salary, String programmingLanguage){
        super(name, id , salary);
        this.programmingLanguage=programmingLanguage;
    }

//    override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programing language: "+ programmingLanguage);
        System.out.println();
    }
}