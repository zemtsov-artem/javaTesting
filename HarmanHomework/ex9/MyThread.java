package ex9;

public class MyThread {
	int a = 0;
	public MyThread(){
	}
	public void start(){
		new Thread(){
			public void run(){
				for(int i = 0; i < 50; i++){
					System.out.println("Thread1: a = "+a++);
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for(int i = 0; i < 50; i++){
					System.out.println("                Thread2: a = "+a++);
				}
			}
		}.start();
	}

}
