
// creating a Student class
public class Student{
   
   //instance variables
   private String name;
   
   private char grade;
   final private int rollNumber;
   
   //class variables
   static String universityName;
   
   // Static variable to store no. of students enrolled
   private static int count = 0;

   
   Student(String name, int rollNumber,char grade){
      this.name=name;
	  this.rollNumber=rollNumber;
	  this.grade=grade;
	  
	  count++;
      }
	  
    public static int displayTotalStudents(){
		return count;
	  }
	  
	public void displayDetails(){
	  if (this instanceof Student){
	  System.out.println("Student name : " + name);
	  System.out.println("Student rollNumber : " + rollNumber);
	  System.out.println("Student grade : " + grade);	  }
	  else{
	     System.out.println("invalid");
		 }
	}
}	