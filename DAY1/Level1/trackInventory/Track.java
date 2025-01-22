//Program to Track Inventory of Items
//Problem Statement: Create an Item class with attributes itemCode, itemName, and price.
// Add a method to display item details and calculate the total cost for a given quantity.

public class Track{
    // Atttributes
    private String itemCode;
    private String itemName;
    private double price;
    private int quantity;
    // Constructor
    Track(String itemCode, String itemName, double price, int quantity){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
        this.quantity= quantity;
    }
    // method to calculate the total cost of the items
    void calculateTotalCost(){
        double totalPrice = price*quantity;
        System.out.println("Total Price is: "+ totalPrice);
    }
    // method to display item details
    void displayDetails(){
        System.out.println("The itemCode is: " + itemCode);
        System.out.println("The itemName is: " + itemName);
        System.out.println("The itemPrice is: " + price);
    }
}