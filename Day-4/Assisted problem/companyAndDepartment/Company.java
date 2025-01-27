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

public class Company {
    private String companyName;
    private List<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(Department department) {
        if (department != null) {
            departments.add(department);
            System.out.println(department.departmentName + " department added to " + companyName + ".");
        }
    }

    // Method to remove a department
    public void removeDepartment(Department department) {
        if (departments.contains(department)) {
            departments.remove(department);
            System.out.println(department.departmentName + " department removed from " + companyName + ".");
        } else {
            System.out.println("Department not found in " + companyName + ".");
        }
    }

    // Method to list all departments and their employees
    public void listDepartments() {
        System.out.println("Departments in " + companyName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.departmentName);
            department.listEmployees();
        }
    }

    // Method to delete the company and all departments
    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        for (Department department : departments) {
            System.out.println("Deleting " + department.departmentName + " department...");
        }
        departments.clear(); // Removes all departments
        System.out.println("Company " + companyName + " deleted.");
    }
}