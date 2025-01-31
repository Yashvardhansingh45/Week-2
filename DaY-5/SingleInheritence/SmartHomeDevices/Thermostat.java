// Sample Problem 2: Smart Home Devices
// Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
// Tasks:
// Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.
// Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
//class subclass
class Thermostat extends Device{
//    Attributes
    private String thempratureSetting;
//    constructor
    Thermostat(int deviceId, String status, String thempratureSetting){
        super(deviceId,status);
        this.thempratureSetting=thempratureSetting;
    }
//    method to display status
    void displayStatus(){
        super.displayStatus();
        System.out.println("temprature of the device is: " +thempratureSetting);
    }
}