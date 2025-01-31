// Sample Problem 1: Online Retail Order Management
// Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:
// Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.
// Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
// Main class
public class Main {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-01-23");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-23", "TRK12345");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-23", "TRK67890", "2025-01-24");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
