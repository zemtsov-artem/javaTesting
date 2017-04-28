package ex1;
public class Main {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Hello");
		t1.start();
		GarbageCollection t2 = new GarbageCollection();
		t2.start();
		MyThread t3 = new MyThread("Hello1");
		t3.start();
		GarbageCollection t4 = new GarbageCollection();
		t4.start();
	}

}
