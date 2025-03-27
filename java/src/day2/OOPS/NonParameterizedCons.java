package day2.OOPS;

public class NonParameterizedCons {
    int num1;
    int num2;
    
    NonParameterizedCons(){
        num1 = 7;
        num2 = 6;

    }
    public static void main(String[] args) {
      // We didn't created any structure
      // a non-parameterized  constructor will invoke here
      NonParameterizedCons obj_x = new NonParameterizedCons();
  
      // Printing the values
      System.out.println("num1 : " + obj_x.num1);
      System.out.println("num2 : " + obj_x.num2);

    }
}
