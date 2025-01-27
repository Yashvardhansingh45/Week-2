
// creating a Patient class
public class Patient{
   
   //instance variables
   private String name;
   private int age;
   private String ailment;
   private final int patientId;
   
   //class variables
   static String hospitalName;
   
   // Static variable to count total patients
   private static int count = 0;

   
   Patient(int patientId, String name, int age, String ailment){
      this.patientId=patientId;
      this.name=name;
	  this.age=age;
	  this.ailment=ailment;
	  
	  count++;
      }
	  
    public static int getTotalPatients(){
      return count;
	  }
	  
	public void displayDetails(){
	  if (this instanceof Patient){
	  System.out.println("Patient Id : " +patientId);
	  System.out.println("Name of Patient : " + name);
	  System.out.println("Age of Patient : " + age);
	  System.out.println("Ailment : "+ailment);
	  }
	  else{
	     System.out.println("invalid");
		 }
	}
}	