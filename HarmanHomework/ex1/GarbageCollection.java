package ex1;

public class GarbageCollection extends Thread {

	@Override
	public void run() {
		System.gc();
		//System.out.println("gc");
		System.runFinalization();
		System.out.println("runFinalization");

	}

}
