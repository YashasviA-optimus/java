package day3;

public class Hierarchical {
  public void printOne() {
    System.out.println("printOne() Method of Hierarchical Class ");
  }
}


// Derived class 1
class One extends Hierarchical {
  public void printTwo() {
    System.out.println("Two() Method of Class One");
  }
}


// Derived class 2
class Two extends Hierarchical {
  public void printThree() {
    System.out.println("printThree() Method of Class Two");
  }
}


// Testing CLass
class Main {
  public static void main(String args[]) {
    One obj1 = new One();
    Two obj2 = new Two();

    // All classes can access the method of class One
    obj1.printOne();
    obj2.printOne();
  }
}
