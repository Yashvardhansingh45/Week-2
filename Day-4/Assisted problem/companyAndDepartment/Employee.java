// Problem 3: Company and Departments (Composition)
// Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition,
// where deleting a company should also delete all departments and employees.
// Tasks:
// Define a Company class that contains multiple Department objects.
// Define an Employee class within each Department.
// Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
// Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
public class Employee{
    private String name;
    private int id;
    private String role;

    // Constructor
    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    // Method to get employee details
    public String getDetails() {
        return "Name: " + name + ", ID: " + id + ", Role: " + role;
    }

    // Behavior method
    public void work() {
        System.out.println(name + " is working as a " + role + ".");
    }
}