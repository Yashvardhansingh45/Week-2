// 6. Online Food Delivery System
// Description: Create an online food delivery system:
// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism
// to handle different types of food items in a single order-processing method.
// Class for Veg Items
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1; // 10% discount for Veg items
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: 10%";
    }
}
