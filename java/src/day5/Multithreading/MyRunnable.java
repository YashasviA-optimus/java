package day5.Multithreading;

// 2nd way to create a thread by implementing the runnable interface

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}
