package ex6;

public class Main {

	public static void main(String[] args) {
		//MyThread t1 = new MyThread();

		Thread t2 = new Thread(new MyThread2());
		t2.start();
	}

}
