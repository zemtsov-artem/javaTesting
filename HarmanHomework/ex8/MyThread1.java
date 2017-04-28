package ex8;

public class MyThread1 extends Thread {
	public void run() {
		synchronized (Main.Lock1) {
			System.out.println("Thread 1: Holding lock 1...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 1: Waiting for lock 2...");

			synchronized (Main.Lock2) {
				System.out.println("Thread 1: Holding lock 1 & 2...");
			}
		}
	}
}