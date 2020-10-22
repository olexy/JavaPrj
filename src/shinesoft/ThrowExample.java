package shinesoft;

public class ThrowExample {
	
	static int s =15;
	static int y = 0;
	static void meth() throws Exception
	{
		if(y==0)
		{
			throw new Exception("Denominator cannot be zero");
		}
		//unreported exception Exception;
       //must be caught or declared to be thrown
       //i.e., if not using throws
       
       //after having throws
      //java.lang.Exception: Den can't be zero
		System.out.println(s/y);
	}
	
	public static void main(String[] args) {
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
