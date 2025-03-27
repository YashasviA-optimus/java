package day5;

import java.util.LinkedList;


public class LinkedlistDemo {
    public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(1);
		list.add(0, -9);
		list.add(1, 12);
		System.out.println(list);
		System.out.println(list.get(1));
		// System.out.println(list.remove());//first
		System.out.println(list.removeLast());
		System.out.println(list);
	


	}
}
