package shinesoft;

import java.util.*;

public class MyArrList {
	
	public static void main(String[] args) {
		String st[] = new String[5];
		ArrayList al1  = new ArrayList();
		ArrayList al2 = new ArrayList(5);
		for(String s:st) 
		{
			System.out.println(s);
		}
		al1.add(10);
		al1.add(null);
		al1.add(10);
		al1.add(null);
		al1.add("10");
		al1.add(45.26);
		al1.add(false);
		al1.add(null);
		
		al2.addAll(al1);
		
		System.out.println(al1);
		System.out.println(al2);
	}
}
