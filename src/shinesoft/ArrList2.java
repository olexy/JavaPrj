package shinesoft;

import java.util.*;

public class ArrList2 {
	
	public static void main(String[] args) {
		ArrayList al1  = new ArrayList();
		ArrayList al2 = new ArrayList(5);
		al1.add(10);
		al1.add(1, true);
		//al1.add(3, true);
		//IndexOutOfBoundsException: Index: 3, Size: 1
		System.out.println(al1);
		
		al2.addAll(al1);
		System.out.println(al2);
	}

}
