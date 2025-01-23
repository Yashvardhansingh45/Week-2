//Program to Simulate a Shopping Cart
//Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
//Add an item to the cart.
//Remove an item from the cart.
//Display the total cost.
//Explanation: The CartItem class models a shopping cart item.
// The methods handle cart operations like adding or removing items and calculating the total cost.
public class CartItem {
    // Fields to store item details
    private String itemName;
    private double price;
    private int quantity;

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Added " + quantity + " x " + itemName + " to the cart.");
    }

    // Method to remove the current item from the cart
    public void removeItem() {
        if (itemName == null) {
            System.out.println("The cart is already empty.");
        } else {
            System.out.println("Removed " + itemName + " from the cart.");
            itemName = null;  // Clear the item from the cart
            price = 0;
            quantity = 0;
        }
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        if (itemName == null) {
            System.out.println("The cart is empty. No items to calculate cost.");
        } else {
            double totalCost = price * quantity;
            System.out.println("Total Cost: $" + totalCost);
        }
    }
}