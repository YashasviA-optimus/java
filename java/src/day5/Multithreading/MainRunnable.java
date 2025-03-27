package day5.Multithreading;

public class MainRunnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        t1.start(); // Starts the thread and executes the `run` method
    }
}


// Thread Lifecycle
// A thread in Java goes through the following states:

// New: When a thread object is created. A thread that has not yet started is in this state.
// Runnable: After calling start(), the thread is ready to run.
// Running: The thread is executing its run() method. A thread executing in the Java virtual machine is in this state.
// Blocked/Waiting: The thread is waiting for a resource or signal. A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
// Timed Waiting: A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
// Terminated: The thread finishes execution.