package shinesoft;

import java.util.*;

public class VectorList {
	
	public static void main(String[] args) {
		Vector v1 = new Vector();
		Vector v2 = new Vector(3);
		Vector v3 = new Vector(5,2);
		System.out.println(v2.capacity());
		System.out.println(v2.size());
		v2.addElement(false);
		v2.add(true);
		v2.addElement(102);
		v2.add(45.32);
		v2.add(null);
		System.out.println(v2.capacity());
		System.out.println(v2.size());
		
		System.out.println("=========== V3 ================");
		
		System.out.println(v3.capacity());
		System.out.println(v3.size());
		v3.addElement(false);
		v3.add(true);
		v3.addElement(102);
		v3.add(45.32);
		System.out.println(v3.capacity());
		System.out.println(v3.size());
		
		System.out.println("************** Enumeration *************");
		
		Enumeration e = v3.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
