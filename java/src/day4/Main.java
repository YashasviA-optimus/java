package day4;

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the implemented sound() method for Dog and Cat
        myDog.sound();  // Output: The dog barks.
        myCat.sound();  // Output: The cat meows.

        // Calling the concrete eat() method from the abstract Animal class
        myDog.eat();  // Output: This animal is eating.
        myCat.eat();  // Output: This animal is eating.
    }
}
