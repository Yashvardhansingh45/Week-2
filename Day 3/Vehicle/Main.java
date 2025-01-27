
// main class
class Main{
  public static void main(String args[]){
  
	// creating object
     Vehicle obj = new Vehicle("Jane Smith", "Two wheeler", 49876);
	
	// calling  methods 
	Vehicle.updateRegistrationFee(500.00);
	 obj.displayDetails();
     
	}
}	