// Sample Problem 1: Restaurant Management System with Hybrid Inheritance
// Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses.
// Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:
// Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface,
// each providing a unique implementation of performDuties().
// Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
// Subclass Chef
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef " + name + " is preparing meals.");
    }
}
