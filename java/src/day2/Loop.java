package day2;

public class Loop {
    public static void main(String[] args) {
        // switch loop
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");

            i++;
        }
        System.out.println();

        // for-loop

        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
        System.out.println();


        //  for-each loop
        int arr[] = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // do-while loop
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 5); // if condition is true then it will work


        System.out.println();
        // do-while loop
        int k1 = 0;
        do {
            System.out.print(k1 + " ");
            k1++;
        } while (k1 > 5); // if condition is false then it will terminate the loop
    }



}
