public class Main {
    public static void main(String []args){
        //crete the object for class Track
        Track Track1= new Track ("IT01", "Chips", 20.0, 200);
        // call the method to display details
        Track1.displayDetails();
        // call the method to display total price
        Track1.calculateTotalCost();
    }
}