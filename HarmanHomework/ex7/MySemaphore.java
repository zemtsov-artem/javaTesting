package ex7;

public class MySemaphore {
	private static int count;
	private static final int MAXTHREADS=1;
	private final static Object lock = new Object();
	public MySemaphore()
	{
		count =1;
	}
	public MySemaphore(int _count)
	{
		count = _count;
	}
	public synchronized void enter()
	{
		while(count <= 0)
		{
			synchronized (lock) {	
				try
				{
					lock.wait();
				}catch (InterruptedException e)
				{
					System.out.println("Interrupted in myWait");
				}
			}
		}
		count--;
	}
	
	public synchronized void leave()
	{
		while(count == MAXTHREADS)
		{
			synchronized (lock) 
			{
				try
				{
					lock.wait();
				}catch (InterruptedException e)
				{
					System.out.println("Interrupted in mySignal");
				}
			}
		}
		count++;
	}

}
