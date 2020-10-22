package shinesoft;

public class FinallyTutor {
	
	public static void main(String[] args) {
		int x=10;
		int y=0;
		int a=10;
		try 
		{
			//int z=x/y;
			int b=x/a;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			//close connection
			System.out.println("I will execute anyway");
		}
	}
		//	Output when you have Exceptions
		//	java.lang.ArithmeticException: / by zero
		//	I will execute anyway
	
		//	Output when you dont have Exceptions
		//	I will execute anyway

}
