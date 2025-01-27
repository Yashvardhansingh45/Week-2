
// creating a Vehicle class
public class Vehicle{
   
   //instance variables
   private String ownerName;
   final private int registartionNumber;
   private String vehicleType;
   
   // Static variable to modify fee
   private static double registrationFee;

   
   Vehicle(String ownerName, String vehicleType, int registartionNumber){
      this.ownerName=ownerName;
	  this.vehicleType=vehicleType;
	  this.registartionNumber=registartionNumber;
      }
	  
    public static void updateRegistrationFee(double registrationFee){
		Vehicle.registrationFee=registrationFee;
	  }
	  
	public void displayDetails(){
	  if (this instanceof Vehicle){
	  System.out.println("Owner name : " + ownerName);
	  System.out.println("Type of vehicle : " + vehicleType);
	  System.out.println("Registration Number : " + registartionNumber);
	  System.out.println("Registration fee : "+registrationFee);
	  }
	  else{
	     System.out.println("invalid");
		 }
	}
}	