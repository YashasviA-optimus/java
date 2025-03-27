package day3;

public class Vehicle {
    public void displayInfo() {
        System.out.println("Some vehicles are there.");
    }

    public static void main(String[] args) {
    Car v1 = new Car(); // Upcasting
    Bike v2 = new Bike(); // Upcasting

    // Calling the overridden displayInfo() method of Car class
    v1.displayInfo();

    // Calling the overridden displayInfo() method of Bike class
    v2.displayInfo();
    }
}


class Car extends Vehicle{
    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("I have a Car.");
    }
}


class Bike extends Vehicle {
    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("I have a Bike.");
    }
}
// we can define psvm method in another file as well
// class Method{
// public static void main(String[] args) {
// Vehicle v1 = new Car(); // Upcasting
// Vehicle v2 = new Bike(); // Upcasting

// // Calling the overridden displayInfo() method of Car class
// v1.displayInfo();

// // Calling the overridden displayInfo() method of Bike class
// v2.displayInfo();
// }
// }



// inside a file we can create the multiple classes and inside the psvm method we can create the object of all those classes
