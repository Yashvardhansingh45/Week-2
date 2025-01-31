// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
// Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.

//subclass Bird
class Bird extends Animal{
//    Attributes
    Bird(String name , int age){
        super(name,age);
    }
//    override
    @Override
    void makeSound(){
        System.out.println("Bird chirps: Chirp Chirp!");
    }
}