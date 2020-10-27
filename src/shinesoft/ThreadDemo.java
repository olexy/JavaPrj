package shinesoft;

class ThreadOne extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++)
		    System.out.println("Hello"+i);
	}
}

class ThreadTwo implements Runnable
{
	public void run() {
		for(int i=6;i<=10;i++)
	   		System.out.println("Today is"+i);
		
	}
}

class ThreadThree extends Thread
{
	public void run() {
		for(int i=11;i<=15;i++)
	        System.out.println("Monday"+i);
	}
	
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();//new state
		ThreadTwo t2 = new ThreadTwo();//Runnable Thread reference
		Thread tr = new Thread(t2);
		ThreadThree t3 = new ThreadThree();	
		
		t1.start();
		//t2.start();
		//start() is undefined for the type ThreadTwo
		tr.start();
		t3.start();
	}

}
