package day4;
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkAge(age);
        
    }
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
    }
   

}
