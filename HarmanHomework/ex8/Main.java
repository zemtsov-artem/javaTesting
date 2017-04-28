package ex8;

public class Main {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}
