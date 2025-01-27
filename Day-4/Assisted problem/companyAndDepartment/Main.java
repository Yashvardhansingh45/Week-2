// Problem 3: Company and Departments (Composition)
// Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition,
// where deleting a company should also delete all departments and employees.
// Tasks:
// Define a Company class that contains multiple Department objects.
// Define an Employee class within each Department.
// Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
// Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
public class Main{
        public static void main(String[] args) {
            // Create a company
            Company company = new Company("Tech Innovators");

            // Create departments
            Department itDepartment = new Department("IT");
            Department hrDepartment = new Department("HR");

            // Add departments to the company
            company.addDepartment(itDepartment);
            company.addDepartment(hrDepartment);

            // Create employees
            Employee emp1 = new Employee("Alice", 101, "Developer");
            Employee emp2 = new Employee("Bob", 102, "Tester");
            Employee emp3 = new Employee("Charlie", 103, "HR Manager");

            // Add employees to departments
            itDepartment.addEmployee(emp1);
            itDepartment.addEmployee(emp2);
            hrDepartment.addEmployee(emp3);

            // List departments and their employees
            company.listDepartments();

            // Remove an employee
            itDepartment.removeEmployee(emp2);

            // List departments again
            company.listDepartments();

            // Delete the company (and all departments)
            company.deleteCompany();
        }
}