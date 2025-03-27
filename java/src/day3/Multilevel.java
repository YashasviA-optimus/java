package day3;

public class Multilevel {
    public void methodX() {
        System.out.println("Class X method");
    }
}


class Y extends Multilevel {
    public void methodY() {
        System.out.println("class Y method");
    }
}


class Z extends Y {
    public void methodZ() {
        System.out.println("class Z method");
    }

    public static void main(String args[]) {
        Z obj = new Z();
        // Y obj = new Y();
        obj.methodX(); // calling grand parent class method
        obj.methodY(); // calling parent class method
        obj.methodZ(); // calling local method
    }

}
