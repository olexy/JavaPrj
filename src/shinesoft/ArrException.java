package shinesoft;

public class ArrException {
	
	public static void main(String[] args) {
		int arr1[] = {10,10,89};
		String d1 = "ghi";
		String d2 = null;
		
		try
		{
			System.out.println(arr1[0]/arr1[1]);
			System.out.println(d2.length());
			
			//NumberFormatException
			int n = Integer.parseInt(d1);
			
			for(int i=0; i<=3; i++) 
			{
				System.out.println(arr1[i]);
			}
			
		}
		
//		catch(NullPointerException e)
//		{
//			e.printStackTrace();
//		}
//		
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
//		
//		catch(NumberFormatException e)
//		{
//			e.printStackTrace();
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
//		
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
		//Multiple catch in a single line without forming a tree
		
		catch(NullPointerException|ArithmeticException|NumberFormatException
				|ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		for(int i : arr1) 
		{
			System.out.println(i);
		}
		
	}

}
