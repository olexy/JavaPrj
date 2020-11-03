package shinesoft;
import java.util.*;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap tm = new TreeMap();
		tm.put(245, 568);
		tm.put(121, "Yihun");
		//Keys should match with the first element, no need of value match
		//Generics is implicitly applied
		System.out.println(tm);
		System.out.println("****** Descending Order *******");
		System.out.println(tm.descendingMap());
		
	}

}
