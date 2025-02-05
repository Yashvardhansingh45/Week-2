// 6. Online Food Delivery System
// Description: Create an online food delivery system:
// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism
// to handle different types of food items in a single order-processing method.

// Main class for testing
class Main {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 10, 3);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 12, 2);

        vegItem.getItemDetails();
        System.out.println("Total Price (after discount): $" + (vegItem.calculateTotalPrice() - ((Discountable) vegItem).applyDiscount()));

        nonVegItem.getItemDetails();
        System.out.println("Total Price (after discount): $" + (nonVegItem.calculateTotalPrice() - ((Discountable) nonVegItem).applyDiscount()));
    }
}

