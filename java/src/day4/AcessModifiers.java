package day4;

public class AcessModifiers {
    public static void main(String[] args) {
        // Java access modifiers are used to specify the scope of the variables, data members,
        // methods, classes, or constructors. 

        // There are four different types of access modifiers in Java, we have listed them as
        // follows:- private , public , protected , default

         // Access Modifiers in Java
        // this file contain all the access modifiers code
    }
}

// Example of public access modifier
// A public class, method, or variable is accessible from any other class.
// package com.example; .....com is a package and example is a sub package

// public class PublicClass {
// public int publicVar = 10;

// public void publicMethod() {
// System.out.println("Public method is accessible from anywhere.");
// }
// }

// // In another package
// package com.another;

// import com.example.PublicClass;

// public class TestPublic {
// public static void main(String[] args) {
// PublicClass obj = new PublicClass();
// System.out.println(obj.publicVar); // Accessible
// obj.publicMethod(); // Accessible
// }
// }



// Example of private access modifier....private modifier can be accessed with in the same class
// package com.example;

// public class PrivateClass {
// private int privateVar = 20;

// private void privateMethod() {
// System.out.println("Private method is accessible only within the same class.");
// }

// public void accessPrivate() {
// System.out.println(privateVar); // Accessible within the same class
// privateMethod(); // Accessible within the same class
// }
// }

// class TestPrivate {
// public static void main(String[] args) {
// PrivateClass obj = new PrivateClass();
// // obj.privateVar; // Not accessible, will cause a compilation error
// // obj.privateMethod(); // Not accessible, will cause a compilation error
// obj.accessPrivate(); // Accessing private members via a public method
// }
// }



// Example of protected access modifier
// package com.example;

// public class ProtectedClass {
// protected int protectedVar = 30;

// protected void protectedMethod() {
// System.out.println("Protected method is accessible within the same package or through
// inheritance.");
// }
// }

// // Subclass in the same package
// class SubClass extends ProtectedClass {
// public void accessProtected() {
// System.out.println(protectedVar); // Accessible within the package
// protectedMethod(); // Accessible within the package
// }
// }

// // In another package
// package com.another;

// import com.example.ProtectedClass;

// public class TestProtected extends ProtectedClass {
// public static void main(String[] args) {
// TestProtected obj = new TestProtected();
// System.out.println(obj.protectedVar); // Accessible through inheritance
// obj.protectedMethod(); // Accessible through inheritance
// }
// }
