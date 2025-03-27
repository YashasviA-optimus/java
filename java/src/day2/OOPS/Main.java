package day2.OOPS;

class StudentDemo {
  String name;
  int age;

  // no-args constructor
  StudentDemo() {
    this.name = "Unknown";
    this.age = 0;
  }

  // parameterized constructor having one parameter
  StudentDemo(String name) {
    this.name = name;
    this.age = 0;
  }

  // parameterized constructor having both parameters
  StudentDemo(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printDetails() {
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + this.age);
  }
}


public class Main {
  public static void main(String[] args) {
    StudentDemo std1 = new StudentDemo(); // invokes no-args constructor
    StudentDemo std2 = new StudentDemo("Jordan"); // invokes parameterized constructor
    StudentDemo std3 = new StudentDemo("Paxton", 25); // invokes parameterized constructor

    // Printing details
    System.out.println("std1...");
    std1.printDetails();

    System.out.println("std2...");
    std2.printDetails();

    System.out.println("std3...");
    std3.printDetails();
  }
}
