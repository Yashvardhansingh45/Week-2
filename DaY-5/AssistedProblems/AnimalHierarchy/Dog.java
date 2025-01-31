// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
// Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.

//  Subclass Dog
class Dog extends Animal {
    //  Attributes for dog
    Dog(String name, int age) {
        super(name, age);
    }

    //    overiding
    @Override
    void makeSound() {
        System.out.println("Dog Barks: Woof Woof!");
    }
}