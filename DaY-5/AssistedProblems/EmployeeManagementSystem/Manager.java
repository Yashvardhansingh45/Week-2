// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each,
// like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

//  Subclass Manager
class Manager extends Employee{
//  Attributes
    private int teamSize;

//  Constructor
    Manager(String name, int id , double salary ,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

//   override
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+ teamSize);
        System.out.println();
    }
}