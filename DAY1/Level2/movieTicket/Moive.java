//Program to Model a Movie Ticket Booking System
//Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
//Book a ticket (assign seat and update price).
//Display ticket details.
// Explanation: The MovieTicket class organizes ticket information with attributes.
// The methods handle booking logic and display ticket details.
public class Movie{
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    //consrtuctor
    Movie(String movieName, String seatNumber, double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
        }
    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}