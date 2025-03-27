package day4;

public class AXEBicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // Implementing the methods of the Bicycle interface
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    // Method to print the current state of the bicycle
    void printStates() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}



// AXEBicycle Class: Implements the Bicycle interface. It provides the actual implementation of the
// methods defined in the interface.
// the main method, an instance of ACMEBicycle is created.
// The methods changeCadence(), changeGear(), speedUp(), and applyBrakes() are called with sample
// values to simulate a bicycle's actions.
// The printStates() method is called to output the current state (cadence, speed, and gear).
