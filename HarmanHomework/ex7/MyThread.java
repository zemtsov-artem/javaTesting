package ex7;

public class MyThread {
	int count;
	MySemaphore mysemaphore = new MySemaphore();
	MyThread()
	{
		count=0;
	}
	void start()
	{
		new Thread()
		{
			public void run()
			{
				mysemaphore.enter();
				System.out.println("Thread1 start");
				for(int i=0;i<2;i++)
				{
					count++;
					System.out.println("Thread1 " + count);
				}
				System.out.println("Thread1 end");
				mysemaphore.leave();
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				mysemaphore.enter();
				System.out.println("Thread2 start");
				for(int i=0;i<2;i++)
				{
					count++;
					System.out.println("Thread2 " + count);
				}
				System.out.println("Thread2 end");
				mysemaphore.leave();
			}
		}.start();
	}


}