package ex2;

public class SharedInt {

    private int var = 0;

    public void increment() {
        Thread t1 = new Thread(){
            public void run(){
                inc();
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                inc();
            }
        };
        t2.start();
    }

    private synchronized void inc(){
        for(int i = 0; i < 1_000_000; i++){
            var++;
        }
        System.out.println("var = " + var);
    }

}
