public class Main {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee emp1 = new Employee(1, "John", "Manager");
        Employee emp2 = new Employee(2, "Smith", "Developer");
        Employee emp3 = new Employee(3, "David", "Tester");

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        // Display total employees
        Employee.displayTotalEmployees();
    }
}
