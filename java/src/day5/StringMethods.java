package day5;

public class StringMethods {

    public static void main(String[] args) {
        // Initialize a string
        String str = "Hello, World!";

        // 1. length() - Get the length of the string
        System.out.println("Length of string: " + str.length());

        // 2. charAt() - Get character at a specific index
        System.out.println("Character at index 0: " + str.charAt(0));

        // 3. toUpperCase() - Convert string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase() - Convert string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. substring() - Extract a substring from a string
        System.out.println("Substring (7, 12): " + str.substring(7, 12));

        // 6. replace() - Replace characters in the string
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 7. contains() - Check if the string contains a substring
        System.out.println("Contains 'Hello': " + str.contains("Hello"));

        // 8. startsWith() - Check if the string starts with a specific prefix
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // 9. endsWith() - Check if the string ends with a specific suffix
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        // 10. indexOf() - Find the index of a character or substring
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // 11. trim() - Remove leading and trailing whitespace
        String strWithSpaces = "  Hello, World!  ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 12. split() - Split the string into an array based on a delimiter
        String[] words = str.split(" ");
        System.out.println("Split by space:");
        for (String word : words) {
            System.out.println(word);
        }

        // 13. equals() - Check if two strings are equal
        String str2 = "Hello, World!";
        System.out.println("Strings are equal: " + str.equals(str2));

        // 14. equalsIgnoreCase() - Check if two strings are equal, ignoring case
        String str3 = "hello, world!";
        System.out.println("Strings are equal (ignore case): " + str.equalsIgnoreCase(str3));

        // 15. valueOf() - Convert other data types to a string
        int number = 123;
        System.out.println("String representation of number: " + String.valueOf(number));

        // Initialize a string using the 'new' keyword
        String str = new String("Hello, World!");
        // However, using new String() explicitly creates a new instance in memory even
        // if the string literal "Hello, World!" might already exist in the string pool.
        // It’s less common to use new String() unless you specifically need a new
        // object for some reason.

    }

}
