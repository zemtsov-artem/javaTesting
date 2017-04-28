package ex6;

public class MyThread2 implements Runnable {

	boolean flag;
	Object monitor;

	@Override
	public void run() {
		monitor = new Object();
		new Thread() {
			public void run() {
				while (!flag) {
					try {
						sleep(1000);
					} catch (InterruptedException e1) {
						System.out.println("Thread 1 Interrupted! before sync");
					}
					synchronized (monitor) {
						try {
							sleep(2000);
						} catch (InterruptedException e) {
							System.out.println("Thread 1 Interrupted!");
						}
						flag = true;
						monitor.notify();
						System.out.println("flag = true");
					}
				}
			}
		}.start();

		new Thread() {
			public void run() {
				synchronized (monitor) {
					System.out.println("thread 2 start");
					try {
						monitor.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					long time = System.currentTimeMillis();

					if (flag == true) {

						flag = false;
						System.out.println("flag changed");

						time = System.currentTimeMillis() - time;
						System.out.println("time = " + time + "ms");

					}
				}
			}
		}.start();

	}

}
