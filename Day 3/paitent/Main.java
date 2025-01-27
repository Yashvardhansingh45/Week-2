
// main class
class Main{
  public static void main(String args[]){
  
	// creating object
     Patient obj1 = new Patient(12,"Jane Smith", 25, "Cold");
	 Patient obj2 = new Patient(13,"John Doe", 30, "Fever");
	// calling  methods 
	 obj1.displayDetails();
	 obj2.displayDetails();
     System.out.println("Total patients admitted : "+ Patient.getTotalPatients());
	}
}	