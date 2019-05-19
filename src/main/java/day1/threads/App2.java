package day1.threads;

public class App2 {
    public static void main(String[] args) {
        Runnable r1 = new MyRunable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.start();
        t2.start();
        t3.start();


    }
}
