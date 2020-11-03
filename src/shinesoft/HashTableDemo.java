package shinesoft;

import java.util.*;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(111, "oneoneone");
		ht.put(222, "twotwotwo");
		ht.put(333, "threethreethree");
		System.out.println(ht);
		
		Enumeration e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(ht.get(e.nextElement()));
		}
	}

}
