
class HotelBooking {
    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking previousBooking) {
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }

    // Display Booking Details
    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        // Default Constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1:");
        booking1.displayBookingDetails();

        // Parameterized Constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("\nBooking 2:");
        booking2.displayBookingDetails();

        // Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nBooking 3 (Copy of Booking 2):");
        booking3.displayBookingDetails();
    }
}