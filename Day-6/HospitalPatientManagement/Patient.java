// 7. Hospital Patient Management
// Description: Design a system to manage patients in a hospital:
// Create an abstract class Patient with fields like patientId, name, and age.
// Add an abstract method calculateBill() and a concrete method getPatientDetails().
// Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
// Implement an interface MedicalRecord with methods addRecord() and viewRecords().
// Use encapsulation to protect sensitive patient data like diagnosis and medical history.
// Use polymorphism to handle different patient types and display their billing details dynamically.
// Abstract class for Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method for calculating bill
    public abstract double calculateBill();

    // Concrete method for getting patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}