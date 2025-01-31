// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each,
// like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
class Employee{
//    Attirbutes
    private String name;
    private int id;
    private double salary;

//    Constructors
    Employee(String name, int id , double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

//    method to display Details
    void displayDetails(){
        System.out.println("Name of the Employee is: "+ name);
        System.out.println("ID of the Employee is: "+id );
        System.out.println("Salary of the Employee is: "+salary);

    }
}
