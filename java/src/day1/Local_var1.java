package day1;

public class Local_var1 {
    public void hello() {
        int p = 10;
        System.out.println();
        System.out.println(p);
    }

    public static void main(String[] args) {
        Local_var1 lv=new Local_var1();
        lv.hello();
        // non-static method can be called directly inside the main method...we will create object of class and with the help of object we can call instance method or variable

    }
}
