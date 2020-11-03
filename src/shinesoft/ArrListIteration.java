package shinesoft;

import java.util.*;

public class ArrListIteration {
	public static void main(String[] args) {
		ArrayList al1  = new ArrayList();
		ArrayList al2 = new ArrayList(5);
		al1.add(10);
		al1.add(1, true);
		al1.add(null);
		al1.add(false);
		al1.add(89.36);
		
		System.out.println(al1);
		
		Iterator i = al1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//al2.addAll(al1);
		//System.out.println(al2);
		System.out.println("========= ListIterator Implementation ===========");
		ListIterator j = al1.listIterator(al1.size());
		
		while(j.hasPrevious())
		{
			System.out.println(j.previous());
		}
	}

}
