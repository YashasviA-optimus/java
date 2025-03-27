package day1;
public class Local_Var_Without_Intialization {

    public void display(){
        // int age; // local var declare without initialization it will give error
        // age = age+10;
        // System.out.println(age);
    }
    public static void main(String[] args) {
        Local_Var_Without_Intialization lv = new Local_Var_Without_Intialization();
        lv.display();
    }
}
