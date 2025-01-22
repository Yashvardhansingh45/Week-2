// Program to Handle Mobile Phone Details
// Problem Statement: Create a MobilePhone class with attributes brand, model, and price.
// Add a method to display all the details of the phone.
// The MobilePhone class uses attributes to store the phone's characteristics.
// The method is used to retrieve and display this information for each object.
class Mobile{
    // Attributes
    private String brand;
    private String model;
    private double price;
    // constructors
    Mobile(String brand, String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    //method to display all details of the phone
    void displayDetails(){
        System.out.println("Brand of the phone is: " +brand);
        System.out.println("Model of the phone is: " +model);
        System.out.println("Price of the phone is: " +price);
    }

}


