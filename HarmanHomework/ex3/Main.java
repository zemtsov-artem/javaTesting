package ex3;


public class Main {

	public static Object monitor = new Object();
	public static volatile Integer var = 0;

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		
		/*MyThread t = new MyThread();
		t.start();*/
	}

}
