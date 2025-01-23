class Main{
public static void main(String[] args) {
    // Creating a Movie object
    Movie ticket = new Movie("Avengers: Endgame", "A12", 15.99);
    // Displaying ticket details
    ticket.displayDetails();
    // Booking a new ticket
    ticket.bookTicket("B10", 20.99);
    // Displaying updated ticket details
    ticket.displayDetails();
}
}
