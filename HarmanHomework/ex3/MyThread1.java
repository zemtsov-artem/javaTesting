package ex3;

public class MyThread1 extends Thread {

	public void run() {
		synchronized (Main.monitor) {
			inc();
		}
	}

	private synchronized void inc() {
		for (int i = 0; i < 1_000_000; i++) {
			Main.var++;
		}
		 //System.out.println(Main.var);
	}
}