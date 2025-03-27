package day1;

public class Instance_var {
    // global variable declared with the help of static keyword
    static int b =2;
    // instance var
    int a = 10;
    
    public void helllo(){
        // local var
        String str = "Yashasvi";
        System.out.println(str);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Instance_var v = new Instance_var();
        
        System.out.println();
        System.out.println(b);
        System.out.println(v.a);
        // System.out.println(v.str);
        v.helllo();
    }
    
}
