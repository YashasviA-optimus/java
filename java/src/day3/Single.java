package day3;

public class Single {
    public void methodA() {
        System.out.println("Base class method");
    }}

class B extends Single{

    public void methodB() {
        System.out.println("Child class method");
    }

    public static void main(String args[]) {
        B obj = new B();
        obj.methodA(); // calling super class method
        obj.methodB(); // calling local method
    }
}
