package day1.threads;

public class App {
    public static void main(String[] args) {

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t2.start();
        t3.start();


    }
}
