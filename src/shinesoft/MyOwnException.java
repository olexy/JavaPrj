package shinesoft;

class CustomException extends RuntimeException
{
	
	CustomException (String str)
	{
		super(str);
	}
}

public class MyOwnException
{
	static int s =15;
	static int y = 0;
	static void meth() throws Exception
	{
		if(y==0) {
			throw new CustomException("Denominator cannot be zero");
		}	
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
