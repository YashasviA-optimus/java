package day2;

public class Statement {
    public static void main(String[] args) {

        // break statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.print(i+ " ");
          }

          System.out.println();
        //   continue statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.print(i+ " ");
          }
    }
}
