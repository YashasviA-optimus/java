package day5.Multithreading;

public class MainThread {
    public static void main(String[] args) {

        // Creating and starting the first thread
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating and starting the second thread
        MyThread thread2 = new MyThread();
        thread2.start();
    }


}
