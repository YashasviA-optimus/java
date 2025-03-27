package day3;

import day2.OOPS.Main;

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Car(); // Upcasting
        Vehicle v2 = new Bike(); // Upcasting
    
        // Calling the overridden displayInfo() method of Car class
        v1.displayInfo();
    
        // Calling the overridden displayInfo() method of Bike class
        v2.displayInfo();
      }
}
