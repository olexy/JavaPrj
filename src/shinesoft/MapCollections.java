package shinesoft;

import java.util.HashMap;

public class MapCollections {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(111, "Hello");
		hm.put(112, "Hi");
		hm.put(113, "Adios");
		hm.put(114, "Hola");
		System.out.println(hm);
		
		hm.put(113, "Greta");
		hm.put(115, "Hola");
		hm.put(null, "USA");
		hm.put(116, null);
		System.out.println(hm);
		hm.remove(112);
		System.out.println(hm);
		
		System.out.println(hm.get(116));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		//hm.clear();
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(114));
		System.out.println(hm.containsKey(120));
		System.out.println(hm.containsValue("Hola"));
		System.out.println(hm.isEmpty());
	}

}
