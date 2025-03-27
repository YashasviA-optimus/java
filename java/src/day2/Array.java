package day2;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        int arr[]; // declaration of an array

        int arr1[] = {1,2,3,4,5}; // initialization of an array


        //take input in an array
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int arr3[] = new int[5];   
         for(int i=0;i<arr3.length;i++){
            arr3[i]=sc.nextInt();
            System.out.println(arr3[i]);

         }
        //  access element of an array with the help of indexing
        int temp = arr3[3];
        System.out.println(temp);
         


    }
}
