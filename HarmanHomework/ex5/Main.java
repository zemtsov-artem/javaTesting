package ex5;

public class Main {

	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
        t.start();
	}

}
