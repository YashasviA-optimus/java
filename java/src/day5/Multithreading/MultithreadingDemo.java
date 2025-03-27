package day5.Multithreading;

public class MultithreadingDemo {
    public static void main(String[] args) {
        // Multithreading in Java allows concurrent execution of two or more threads, enabling tasks
        // to run simultaneously and improving application performance. Threads can be created by
        // either extending the Thread class or implementing the Runnable interface, with Runnable
        // preferred for better design and flexibility.

        // The process of executing multiple tasks (also called threads) simultaneously is called
        // multithreading. The primary purpose of multithreading is to provide simultaneous
        // execution of two or more parts of a program to make maximum use of CPU time. A
        // multithreaded program contains two or more parts that can run concurrently. It enables
        // programmers to write in a way where multiple activities can proceed simultaneously within
        // a single application.

        // Multi-threading enables you to write in a way where multiple activities can proceed
        // concurrently in the same program. To achieve the multithreading (or, write multithreaded
        // code), you need java.lang.Thread class.

        // read the thread life cycle, thread priorities, Two ways to create a thread in java,
        // thread methods



        // Thread Methods
        // start(): Starts the thread, calling its run() method.
        // run(): Defines the code executed by the thread.
        // sleep(milliseconds): Pauses the thread for a specified duration.
        // join(): Waits for a thread to finish before continuing.
        // isAlive(): Checks if the thread is still running.
        // getName() and setName(String name): To retrieve or set a thread’s name.
    }
}
