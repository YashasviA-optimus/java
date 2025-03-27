package day4;

public class ThrowsExample {
     // Method that checks if a number is positive, throws an exception if it's not
     public void checkPositiveNumber(int number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        System.out.println("The number is positive.");
    }

    public static void main(String[] args) {
        ThrowsExample obj = new ThrowsExample();

        // Call the method and handle the exception if it occurs
        try {
            obj.checkPositiveNumber(-5); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Call the method with a positive number (no exception)
        try {
            obj.checkPositiveNumber(10); // This will not throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
