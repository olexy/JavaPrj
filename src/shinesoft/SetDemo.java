package shinesoft;

import java.util.*;

public class SetDemo {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(56);
		hs.add(false);
		hs.add(89.36);
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(56);
		lhs.add(false);
		lhs.add(89.36);
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		//ts.add("Hello");
		//java.lang.String cannot be cast to java.lang.Integer
		ts.add(78);
		//java.lang.Integer cannot be cast to java.lang.Boolean
		//ts.add(false);
		//ts.add(89.36);
		ts.add(56);
		ts.add(65);
		ts.add(96);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		Iterator i = ts.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
