class Employee {
    public int employeeID;        // Public
    protected String department;  // Protected
    private double salary;        // Private

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }

    // Display Employee Details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    // Constructor
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Display Manager Details
    void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee(101, "Engineering", 75000.00);
        emp.displayEmployeeDetails();

        // Updating and displaying salary
        emp.setSalary(80000.00);
        System.out.println("\nAfter Salary Update:");
        emp.displayEmployeeDetails();

        // Creating Manager object
        Manager manager = new Manager(201, "Engineering", 120000.00);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}

