package day4;

public abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();

    // Concrete method (with body)
    public void eat() {
        System.out.println("This animal is eating.");
    }
}


// Subclass Dog that extends Animal
class Dog extends Animal {

    // Providing implementation of the abstract method sound()
    public void sound() {
        System.out.println("The dog barks.");
    }
}


// Subclass Cat that extends Animal
class Cat extends Animal {

    // Providing implementation of the abstract method sound()
    public void sound() {
        System.out.println("The cat meows.");
    }
}



// Which is the Better Approach?
// For small projects or learning exercises, putting everything in one file might be fine. It's
// quick, simple, and easy to understand.

// For larger or production-level projects, keeping child classes in separate files is the preferred
// approach. This method makes it easier to:

// Navigate your project (especially when there are many classes).
// Maintain and extend the codebase in the future.
// Avoid potential conflicts with public class names (since in Java, a file can only have one public
// class).


// For most professional and scalable projects, it's better to place each class (including child
// classes) in its own file. This will keep your code organized and help with maintainability as
// your project grows.


// We can make separate file for each classes(child classes ) as well