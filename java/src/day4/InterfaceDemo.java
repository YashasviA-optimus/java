package day4;

public class InterfaceDemo {
    // Defining an interface
    interface Animal {
        // Abstract method (doesn't have a body)
        void sound();

        // Another abstract method
        void sleep();
    }

    // Implementing the interface in a class
    class Dog implements Animal {

        // Providing implementation for the sound method
        public void sound() {
            System.out.println("Woof Woof");
        }

        // Providing implementation for the sleep method
        public void sleep() {
            System.out.println("Dog is sleeping.");
        }
    }

    class Cat implements Animal {

        // Providing implementation for the sound method
        public void sound() {
            System.out.println("Meow Meow");
        }

        // Providing implementation for the sleep method
        public void sleep() {
            System.out.println("Cat is sleeping.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Creating objects of Dog and Cat
            Animal myDog = new Dog();
            Animal myCat = new Cat();

            // Calling methods on the objects
            myDog.sound(); // Output: Woof Woof
            myDog.sleep(); // Output: Dog is sleeping.

            myCat.sound(); // Output: Meow Meow
            myCat.sleep(); // Output: Cat is sleeping.
        }
    }

}

// interface executed code in Bicycle file
// In Java, an interface is a reference type, similar to a class, that can contain only abstract
// methods (methods without a body) and constants (public static final variables). An interface
// specifies a contract that classes can implement. By implementing an interface, a class agrees to
// provide specific implementations for the methods declared in the interface.

// Key Points About Interfaces:
// Abstract Methods: All methods in an interface are implicitly abstract, which means they do not
// have a body (prior to Java 8). In Java 8 and later, interfaces can have default methods (methods
// with a body).
// No Constructors: You cannot create objects of an interface directly.
// Multiple Inheritance: A class can implement multiple interfaces, overcoming the limitation of
// Java’s single inheritance for classes.
// Inheritance: A class implements an interface, not extends it. Interfaces can also extend other
// interfaces.
// Constant Variables: All variables declared in an interface are implicitly public, static, and
// final.
// Syntax of an Interface:

// interface MyInterface {
// // Abstract method (no body)
// void myMethod();

// // Constant variable
// int CONSTANT_VALUE = 10;
// }
