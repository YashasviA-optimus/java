package day4;

import java.util.*; // it will import all the classes of java.util package (*) is used to import the
                    // whole package
import java.util.Scanner; // import the scanner class of java.util package
import java.lang.Math;

public class ImportAndPackage {
    public static void main(String[] args) {
        // The import keyword is used to import a package, class or interface.
        // In Java, the import keyword is used to bring other classes or entire packages into the current class, making it possible to access their functionality without needing to use their fully qualified names. This helps make the code more readable and easier to manage by allowing you to avoid long package names.

        // import package.name.Class; // Import a single class
        // import package.name.*; // Import the whole package

        Scanner scanner = new Scanner(System.in); // Now you can use Scanner without fully //
                                                  // qualifying it
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println(Math.pow(2, 4));


    }
}


// for package and package hierarchy prefer the doc of simplilearn
// package hierarchy means java.util.Scanner...java is a package , util is a sub package which is
// inside the java package and Scanner is a class inside the util subpackage
