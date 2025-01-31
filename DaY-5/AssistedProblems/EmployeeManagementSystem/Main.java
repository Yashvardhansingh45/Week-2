// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each,
// like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

// main class
class Main{
    public static void main(String []args){
//        create objects
        Employee manager = new Manager("Yash", 21, 10000000.0 , 5);
        Employee developer = new Developer ("Paishwani", 22, 20000000.0 , "Java");
        Employee intern = new Intern ("Srijan", 23, 100000.0 , "TIT");

//        call objects
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}