package shinesoft;

class DepWithDraw
{
	int amount = 10000;
	
	synchronized void withDraw(int amount)
	{
		if(this.amount<amount)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Amount to be withdrwan is "+amount);
		//System.out.println("Amount in the bank is "+this.amount);
		this.amount = this.amount - amount;
		System.out.println("Amount remaining afetr withdrwawal is "+this.amount);
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Amount to be deposited is "+amount);
		this.amount = this.amount + amount;
		System.out.println("Amount in the bank is "+this.amount);
		notifyAll();
	}
}

public class BankTransaction 
{
	public static void main(String[] args) 
	{
		final DepWithDraw dwd = new DepWithDraw();
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				dwd.withDraw(15000);
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				dwd.deposit(10000);
			}
		};
		
		t1.start();
		t2.start();
	}

}
