package day5;

public class StringbufferDemo {
    public static void main(String[] args) {
        
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        
        // Print the current length of the StringBuffer
        System.out.println("Length of sb: " + sb.length()); // Output: 5
        
        // Append a character to the StringBuffer
        sb.append('c');
        System.out.println("Capacity of sb after append: " + sb.capacity()); // Default capacity is 16, adjusted for length

        // Create an empty StringBuffer object
        StringBuffer sb1 = new StringBuffer();
        
        // Append another string
        sb.append(" Bye");
        System.out.println("StringBuffer content: " + sb); // Output: Hello c Bye
        
        // Check the length after appending
        System.out.println("Length of sb after appending Bye: " + sb.length()); // Output: 10
        
        // Append more text to increase length and check the capacity
        sb.append(" HellocBhelo1");
        System.out.println("Length after appending more text: " + sb.length()); // Output: 22
        System.out.println("Capacity of sb: " + sb.capacity()); // Output: Depends on the internal resizing
        
        // Append a character and check the capacity
        sb.append('a');
        System.out.println("Capacity of sb after appending 'a': " + sb.capacity());
        
        // Display the full StringBuffer content
        System.out.println("StringBuffer content: " + sb);
        
        // Insert text at a specific index
        sb.insert(1, "ll");
        System.out.println("After insert at index 1: " + sb); // Output: HllHello c Bye
        
        // Convert StringBuffer to String
        String s = sb.toString(); 
        System.out.println("String representation of StringBuffer: " + s); // Output: HllHello c Bye
        
        // Reverse the content of StringBuffer
        System.out.println("Reversed StringBuffer: " + sb.reverse()); // Output: eyB c olleHllH
        
        // Access the character at index 2
        System.out.println("Character at index 2: " + sb.charAt(2)); // Output: y
        
        // Substring between two indices
        System.out.println("Substring from index 1 to 3: " + sb.substring(1, 3)); // Output: ey

    }
}
