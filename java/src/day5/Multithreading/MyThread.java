package day5.Multithreading;
import java.lang.Thread;

// 1st way to create a thread by extending a thread class

public class MyThread extends Thread {
     // Override the run method to define the task to be executed by this thread
     public void run() {
        System.out.println("Thread is running...");
    }

}
