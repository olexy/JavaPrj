package shinesoft;

public class ThrowDemo {
	
	static int s =15;
	static int y = 22;
	static void meth() throws ArithmeticException, 
							NullPointerException
	{
		//System.out.println(s);
		System.out.println(10/0);
		String s1=null;
		System.out.println(s1.length());
		//System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(s);
		try {
			meth();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(y);
	}

}
