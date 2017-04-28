package ex4;

public class MyThread implements Runnable {
    @Override
    public void run() {
        new Synch().m1();
    }
}
