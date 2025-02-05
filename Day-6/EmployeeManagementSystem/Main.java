// 1. Employee Management System
// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
class Main{
    public static void main(String []args){
//        Creating an array of Employee type
        Employee[]employees= new Employee[2];
//        Creating Employee objects
        FullTimeEmployee emp1= new FullTimeEmployee(21,"Yash",10000,15000);
        emp1.assignDepartment("HR");

        PartTimeEmployee emp2= new PartTimeEmployee(22,"Roop",5000,340,100);
        emp2.assignDepartment("IT");

//        Storing objects in an array
        employees[0]=emp1;
        employees[1]=emp2;
//        Iterating over the array and displaying details
        for (Employee emp: employees){
            emp.displayDetails();
            if(emp instanceof Department){
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("---------------------");
        }
    }
}