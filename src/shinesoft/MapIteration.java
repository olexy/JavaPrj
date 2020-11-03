package shinesoft;

import java.util.*;


public class MapIteration {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("111", "Hello");
		hm.put(11.2, "float");
		hm.put("113", 311);
		hm.put(false, 56.32);
		System.out.println(hm);
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		//hm1.put("111", "Hello");
		//The method put(Integer, String) in the type HashMap<Integer,String> 
		//is not applicable for the arguments (String, String)
		
		Set s = hm.keySet();
		
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			System.out.println(obj+":"+hm.get(obj));
		}
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(111, "Hello");
		lhm.put(112, "Hi");
		lhm.put(113, "Adios");
		lhm.put(114, "Hola");
		System.out.println(lhm);
		
		Set sk = lhm.keySet();
		
		Iterator j = sk.iterator();
		while(j.hasNext())
		{
			Object obj = j.next();
			System.out.println(obj+":"+lhm.get(obj));
		}
	}

}
