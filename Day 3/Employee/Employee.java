// Create a class Employee 

public class Employee {

	// create a static variale to store company name
	static String companyName = "XYZ";

	// Attributes
	 final int id;
	 String name;
	 String designation;

	// Static variable to store total employees
	static int count = 0;

	// Constructor
	Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		count++;
	}

	// Method to display total employees
	static void displayTotalEmployees() {
		System.out.println("Total Employees: "+count);
	}

	// Method to display employee details
	void displayDetails(){
		if(this instanceof Employee){
			System.out.println("ID: "+id);
			System.out.println("Name: "+name);
			System.out.println("Designation: "+designation);
			System.out.println("Company Name: "+companyName);
		}
		else{
			System.out.println("Invalid Employee");
		}
	}
}