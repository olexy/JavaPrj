package shinesoft;

import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(154);
		ll.add("Hello");
		ll.add(null);
		ll.addLast(false);
		ll.addFirst(45.36);
		
		System.out.println(ll);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(154);
		ll1.add(null);
		//add(Integer) in the type LinkedList<Integer> 
		//is not applicable for the arguments
//		ll1.add("Hello");
//		ll1.addLast(false);
//		ll1.addFirst(45.36);
		
		System.out.println(ll1);

	}

}
