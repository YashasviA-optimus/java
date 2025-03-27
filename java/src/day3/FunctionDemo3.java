package day3;

public class FunctionDemo3 {
    static int val = 100; //global variable 

	public static void main(String[] args) {
		
		System.out.println("Hello");
		int a = 7;
		int b = 9;
		System.out.println(addition(a, b));
		System.out.println(val);

	}

	public static int addition(int a, int b) {

		int c = a + b;
		// sub(a, b);
		val = 901;
		int val = 90;
        // val=val+5;
		FunctionDemo3.val = val + 5;
		return c;
	}

}
		