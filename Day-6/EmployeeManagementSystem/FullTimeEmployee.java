// 1. Employee Management System
// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
class FullTimeEmployee extends Employee implements Department{
//    Attributes
    private String department;
    private double fixedSalary;
//    Constructor
    FullTimeEmployee(int employeeId, String name, double baseSalary , double fixedSalary){
        super(employeeId,name,baseSalary);
        this.fixedSalary=fixedSalary;
    }
//    method to calculate Salary
    @Override
    public double calculateSalary(){
        return getBaseSalary() + fixedSalary;
    }
//    method to assign Department
    @Override
    public void assignDepartment(String departmentname){
        this.department=departmentname;
    }
//    method to get department details
    public String getDepartmentDetails(){
        return "Department :"+ department;
    }
}