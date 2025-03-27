package day3;

public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog("Buddy");
        dog.speak();  // Output: Buddy says woof!
        dog.run();

        // Creating an object of the superclass
        // Animal animal = new Animal("Generic Animal");
        // animal.speak();  // Output: Generic Animal makes a sound.
    }
    // When a new class is created from an existing class in a such a way that new class can access all the features and functionalities of parent class is known as inheritance
}
