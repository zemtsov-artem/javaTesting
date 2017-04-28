package ex3;


public class MyThread2 extends Thread {
	public void run() {
		synchronized (Main.monitor) {
			System.out.println("var = " + Main.var);
		}
	}
}