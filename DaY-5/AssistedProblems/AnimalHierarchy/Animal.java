// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
// Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
class Animal{
//    Attributes
    private String name;
    private int age;

//    Constructors
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

//  Method to animal making sound
     void makeSound(){
        System.out.println("Animals make a sounds: ");
    }
}