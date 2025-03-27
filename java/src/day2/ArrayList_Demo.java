package day2;
import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            // add method to add the elements in a list
            ls.add(sc.nextInt());
        }
        

        // display all the elements of an arraylist and access by using get()
        for(int j=0;j<n;j++){
            System.out.print(ls.get(j) + " ");
        }

        System.out.println();

        // to sort the arrayList
        Collections.sort(ls);

        for(int j=0;j<n;j++){
            System.out.print(ls.get(j) + " ");
        }

        // to set the element at particular index using set()
        ls.set(1,20);
        System.out.println();

        for(int j=0;j<n;j++){
            System.out.print(ls.get(j) + " ");
        }
        


    }
}
