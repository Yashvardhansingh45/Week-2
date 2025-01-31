// Sample Problem 2: School System with Different Roles
// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
// Subclass Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff, Department: " + department);
    }
}
