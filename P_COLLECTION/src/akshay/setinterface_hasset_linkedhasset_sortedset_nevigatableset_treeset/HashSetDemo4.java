package akshay.setinterface_hasset_linkedhasset_sortedset_nevigatableset_treeset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("raj");
		list.add("dev");
		list.add("demo");
		list.add("roza");
		
		HashSet hs = new HashSet();
		hs.addAll(list);//add elements from ArrayList Class.
		hs.add(10);
		hs.add("Akshay");
		hs.add("Doma");
		hs.add(null);
		hs.add(10);
		hs.add("Akshay");
		hs.add(null);
		
		System.out.println(hs);
	}
}
