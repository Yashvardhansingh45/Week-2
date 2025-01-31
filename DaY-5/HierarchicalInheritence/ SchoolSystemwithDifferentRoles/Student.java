// Sample Problem 2: School System with Different Roles
// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
// Subclass Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }
}
