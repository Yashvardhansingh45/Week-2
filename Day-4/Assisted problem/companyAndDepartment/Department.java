// Problem 3: Company and Departments (Composition)
// Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition,
// where deleting a company should also delete all departments and employees.
// Tasks:
// Define a Company class that contains multiple Department objects.
// Define an Employee class within each Department.
// Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
// Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
import java.util.ArrayList;
import java.util.List;

public class Department{
     String departmentName;
    private List<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
            System.out.println(employee.getName() + " added to " + departmentName + " department.");
        }
    }

    // Method to remove an employee
    public void removeEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println(employee.getName() + " removed from " + departmentName + " department.");
        } else {
            System.out.println("Employee not found in " + departmentName + " department.");
        }
    }

    // Method to list all employees in the department
    public void listEmployees() {
        System.out.println("Employees in " + departmentName + " department:");
        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
        }
    }
}