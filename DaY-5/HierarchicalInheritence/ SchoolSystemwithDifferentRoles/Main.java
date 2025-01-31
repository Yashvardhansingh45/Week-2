// Main class
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 45, "Administration");

        teacher.displayInfo();
        teacher.displayRole();

        student.displayInfo();
        student.displayRole();

        staff.displayInfo();
        staff.displayRole();
    }
}
