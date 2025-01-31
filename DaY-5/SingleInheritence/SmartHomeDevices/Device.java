// Sample Problem 2: Smart Home Devices
// Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
// Tasks:
// Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.
// Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.

class Device{
//    Attributes
    private int deviceId;
    private String status;
//    constructor
    Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }
//    method to display status
    void displayStatus(){
        System.out.println("Device Id: "+deviceId+", Status "+status);
    }
}