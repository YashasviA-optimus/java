package day2;

import java.util.*;

public class Multidimensional_Array {
    public static void main(String[] args) {
        int arr[][];

        int arr1[][] = {{1, 2, 3, 4}, {5, 6, 7}};

        System.out.println(arr1[1][2]);


        int n = 3;
        Scanner sc = new Scanner(System.in);
        int arr3[][] = new int[n][n];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = sc.nextInt();
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
