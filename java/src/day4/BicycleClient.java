package day4;

public class BicycleClient {
    public static void main(String[] args) {
        // Create an instance of ACMEBicycle
        AXEBicycle myBike = new AXEBicycle();

        // Change cadence, gear, speed, and apply brakes
        myBike.changeCadence(50);
        myBike.changeGear(3);
        myBike.speedUp(20);
        myBike.applyBrakes(5);

        // Print the current state of the bike
        myBike.printStates();
    }
}
