// 1. Employee Management System
// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

class PartTimeEmployee extends Employee implements Department {
//    Attributes
    private String department;
    private int workHours;
    private double hourlyRate;
//    constructors
    PartTimeEmployee(int employeeId, String name , double baseSalary , int workHours, double hourlyRate){
        super(employeeId,name,baseSalary);
        this.workHours=workHours;
        this.hourlyRate=hourlyRate;
    }
//    method to calculate Salary
    @Override
    public double calculateSalary(){
        return getBaseSalary()+ (workHours * hourlyRate);
    }
//    method to assing Department
    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
//    method to get department details
     @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
     }
}