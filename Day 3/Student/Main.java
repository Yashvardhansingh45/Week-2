
// main class
class Main{
  public static void main(String args[]){
  
	// creating object
     Student obj1 = new Student("Jane Smith",234, 'A');
	 Student obj2 = new Student("John Doe",311, 'B');
	
	// calling  methods 
	obj1.displayDetails();
	obj2.displayDetails();
	 System.out.println("total Students enrolled : "+ Student.displayTotalStudents());
     
	}
}	