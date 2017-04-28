package ex4;

public class Synch {

    public synchronized void m1(){
        System.out.println("m1");
        m2();
    }

    public synchronized void m2(){
        System.out.println("m2");
        m3();
    }

    public synchronized void m3(){
        System.out.println("m3");
    }
}
