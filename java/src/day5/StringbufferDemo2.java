package day5;

public class StringbufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Insert a string at index 6
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        
        // Delete part of the string
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);
        
        // Replace part of the string
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        
        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Get character at index 2
        System.out.println("Character at index 2: " + sb.charAt(2));
        
        // Get substring from index 1 to 3
        System.out.println("Substring: " + sb.substring(1, 3));
        
        // Convert to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
