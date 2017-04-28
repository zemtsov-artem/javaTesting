package ex6;

public class MyThread {
	boolean flag;
	Object monitor;

	public MyThread() {
		monitor = new Object();
		new Thread() {
			public void run() {
				synchronized (monitor) {
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						System.out.println("Thread 1 Interrupted!");
					}
					flag = true;
					System.out.println("flag = true");
				}

			}
		}.start();

		new Thread() {
			public void run() {
				while (true) {
					synchronized (monitor) {
						System.out.println("thread 2 start");
						long time = System.currentTimeMillis();

						if (flag == true) {

							flag = false;
							System.out.println("flag changed");

							time = System.currentTimeMillis() - time;
							System.out.println("time = " + time + "ms");
							break;
						}
					}
				}
			}
		}.start();
	}

}