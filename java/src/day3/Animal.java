package day3;

public class Animal {
    String name;
    
    // Constructor of the superclass
    public Animal(String name) {
        this.name = name;
    }
    
    // Method of the superclass
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass (Child Class)
class Dog extends Animal {

    // Constructor of the subclass
    public Dog(String name) {
        // Calling the superclass constructor to initialize 'name'
        super(name);
    }

    public void run(){
        System.out.println("dog is running");
    }
    
    // Method overriding in the subclass
    // @Override
    // public void speak() {
    //     System.out.println(name + " says woof!");
    // }
}
