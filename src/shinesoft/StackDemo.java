package shinesoft;

import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(true);
		stk.push(478);
		stk.push(null);
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk.empty());
		System.out.println(stk.search(true));
	}

}
