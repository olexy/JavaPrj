package shinesoft;

public class ArrClass {
	
	public static void main(String args[])
	{
		//Arrays without size
		int arr1[] = {45,78,97};
		
		System.out.println("for loop; element based approach");
		for(int ar : arr1)
		{
			System.out.println(ar);
		}		
		
		
		System.out.println("for loop; index based approach");
		for(int i = 0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);	
		}
		
		/*
		 for loop; element based approach
			45
			78
			97
		for loop; index based approach
			45
			78
			97 
		 */
		
		//Arrays with size
		int arr1s[] = new int[5];
		int arr2s[][] = new int[3][2];
		
		System.out.println("for loop; element based approach");
		for(int ar : arr1s)
		{
			System.out.println(ar);
		}		
		
		
		System.out.println("for loop; index based approach");
		for(int i = 0;i<arr1s.length;i++)
		{
			System.out.println(arr1s[i]);	
		}
		/*
		 * for loop; element based approach
			0
			0
			0
			0
			0
		for loop; index based approach
			0
			0
			0
			0
			0
		 */
		
		int arr2[][] = {{12,78,36,14},
						{58,47,12,10}};
		
		System.out.println("Nested for loop; element based approach");
		for(int ar[] : arr2)
		{
			for(int r : ar) 
			{
				System.out.print(r+ " ");
			}
			System.out.println();
		}		
		
		
		System.out.println("Nested for loop; index based approach");
		for(int i = 0;i<arr2.length;i++)
		{
			for(int j = 0; j<arr2[i].length;j++) 
			{
				System.out.print(arr2[i][j]+" ");
			}
				
			System.out.println();
		}
	}

}
