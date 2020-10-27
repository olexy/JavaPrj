package shinesoft;

class JoinOne extends Thread
{
   public void run()
   {
	   for(int n=1;n<=5;n++)
	       System.out.println("5 Table"+5*n);
   }
}
class JoinTwo extends Thread
{
	   public void run()
	   {
		  for(int n=1;n<=5;n++)
		       System.out.println("10 Table"+10*n);
	   }
}
class JoinThree extends Thread
{
	public void run()
    {
	  for(int n=1;n<=5;n++)
	       System.out.println("15 Table"+15*n);
     }

} 

public class JoinMethod 
{

	public static void main(String[] args) {
		JoinOne jo1 = new JoinOne();
		JoinTwo jo2 = new JoinTwo();
		JoinThree jo3 = new JoinThree();
		jo1.start();
		try 
		{
			jo1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		jo2.start();
		
		jo3.start();
		
	}
}
