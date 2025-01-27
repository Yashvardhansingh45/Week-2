class Person {
    // Attributes
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    // Display Person Details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Parameterized Constructor
        Person person1 = new Person("John", 25);
        System.out.println("Person 1:");
        person1.displayPersonDetails();

        // Copy Constructor
        Person person2 = new Person(person1);
        System.out.println("\nPerson 2 (Copy of Person 1):");
        person2.displayPersonDetails();
    }
}