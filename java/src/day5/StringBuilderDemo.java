package day5;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.length());
        sb.append('c');
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity()); 
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); // default capacity is 16
        sb.append("Bye");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("HellocBhelo1");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append('a');
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.insert(1, "ll");
        System.out.println(sb);
        String s = sb.toString();// Builder to String
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(2));
        System.out.println(sb.substring(1, 3));



    }
}



// Key differences between StringBuilder and StringBuffer:
// Thread Safety:

// StringBuffer is synchronized, making it thread-safe, but can have a slightly slower performance due to this overhead.
// StringBuilder is not synchronized, meaning it is not thread-safe but performs better than StringBuffer in single-threaded environments.
// Usage:

// If thread-safety is not a concern, StringBuilder is typically preferred due to its faster performance.
// If thread-safety is required (e.g., in multi-threaded applications), StringBuffer should be used.


// Key Differences Regarding Multithreading:
// StringBuffer: Thread-safe, slower due to synchronization.
// StringBuilder: Not thread-safe, faster in single-threaded applications.
// When to Use Each:
// Use StringBuffer if you need thread safety and anticipate that multiple threads might be modifying the same string.
// Use StringBuilder if you're working in a single-threaded environment or don't need synchronization, as it will perform better.


// StringBuffer is designed for multithreaded environments because it is thread-safe.
// StringBuilder is optimized for single-threaded environments and does not provide synchronization, making it more efficient in such scenarios.