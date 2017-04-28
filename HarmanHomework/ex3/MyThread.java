package ex3;

public class MyThread {

	private volatile Integer var = 0;
	protected Object monitor = new Object();;

	public void start() {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (monitor) {
					inc();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				synchronized (monitor) {
					System.out.println("var = " + var);
				}
			}
		};
		t2.start();
	}

	private synchronized void inc() {
		for (int i = 0; i < 1_000_000; i++) {
			var++;
		}
		// System.out.println(var);
	}

}
