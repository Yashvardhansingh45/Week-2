// Sample Problem 1: Online Retail Order Management
// Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:
// Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.
// Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
class ShippedOrder extends Order {
//    Attributes
    private String trackingNumber;
//    costructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
//    method to get Order Status
    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}