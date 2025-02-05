// 1. Employee Management System
// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

abstract class Employee{
//    Attributes
    private int employeeId;
    private String name;
    private double baseSalary;
//    constructor
    Employee(int employeeId, String name, double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
//    method to get employeeId
    public int getEmployeeId(){
        return employeeId;
    }
//    method to get name
    public String getName(){
        return name;
    }
//    method to get salary
    public double getBaseSalary(){
        return baseSalary;
    }
//    method to set salary
    public void setBaseSalary(double baseSalary){
            this.baseSalary=baseSalary;
    }
//    method to calculate salary
    public abstract double calculateSalary();
//    mehtod to display details
    public void displayDetails(){
        System.out.println("Employee ID is: "+employeeId+" ,name is: "+name+" ,Salary is: "+ calculateSalary());
    }
}
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}