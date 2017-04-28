package ex5;

import java.util.concurrent.TimeUnit;

public class MyThread implements Runnable {
	Object monitor;

	MyThread() {
		monitor = new Object();
	}

	@Override
	public void run() {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (monitor) {
					System.out.println("Thread 1 started");
					try {
						System.out.println("Thread 1 wait");
						monitor.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("message from Thread 1");

				}
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				synchronized (monitor) {
					System.out.println("Thread 2 started");
					try {
						System.out.println("Thread 2 sleep");
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					monitor.notifyAll();
					System.out.println("Thread 2 notifyAll");
				}

			}
		};
		t2.start();
	}
}