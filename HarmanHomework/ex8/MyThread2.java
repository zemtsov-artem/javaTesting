package ex8;

public class MyThread2 extends Thread {
	public void run() {
		synchronized (Main.Lock2) {
			System.out.println("Thread 2: Holding lock 2...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 2: Waiting for lock 1...");

			synchronized (Main.Lock1) {
				System.out.println("Thread 2: Holding lock 1 & 2...");
			}
		}
	}
}