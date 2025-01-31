// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
// Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.

//  Main class
class Main{
    public static void main(String []args){
//        makeing the object
        Animal dog= new Dog("Nobru",21);
        Animal cat= new Cat("Sinzu",2);
        Animal bird= new Bird("Mi", 1);

//        call the method
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}