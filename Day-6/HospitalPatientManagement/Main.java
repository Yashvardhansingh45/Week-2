
// Main class for testing
class Main {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John", 45, 500, 5);
        Patient outPatient = new OutPatient("P002", "Jane", 30, 100);

        inPatient.getPatientDetails();
        System.out.println("Total Bill: $" + inPatient.calculateBill());

        outPatient.getPatientDetails();
        System.out.println("Total Bill: $" + outPatient.calculateBill());

        ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
        System.out.println("In-Patient Records:\n" + ((MedicalRecord) inPatient).viewRecords());
    }
}
