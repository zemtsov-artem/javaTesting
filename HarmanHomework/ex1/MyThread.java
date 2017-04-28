package ex1;

public class MyThread extends Thread {

	private String message;

	public MyThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(message);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void finalize() {
		System.out.println("Shut-down message");
	}
}
