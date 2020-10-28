package shinesoft;

class SyncDemo
{	//=============== Synchronized method ================
	static synchronized void mulTab(int n)
	{
		for(int i=1;i<=5;i++)
			System.out.println(n+"X"+i+"="+(n*i));
		
	/* ========== Synchronized block =====================
	 * 
		 void mulTab(int n)
		{
			synchronized(this){			
				for(int i=1;i<=5;i++)
					System.out.println(n+"X"+i+"="+(n*i));
			}	
		}
	==================================================== */
		
	}
}

public class SynchronizeDemo 
{
	public static void main(String[] args) 
	{
		//final SyncDemo sd = new SyncDemo();
		//is not required because of the static keyword
		Thread t1 = new Thread()
		{
			public void run()
			{
				SyncDemo.mulTab(5);
				
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				SyncDemo.mulTab(10);
				
			}
		};
		
		Thread t3 = new Thread()
		{
			public void run()
			{
				SyncDemo.mulTab(15);
				
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
