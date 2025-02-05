// Class for Out-Patients
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalRecords = "";

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords += record + "\n";
    }

    @Override
    public String viewRecords() {
        return medicalRecords;
    }
}