package akshay.setinterface_hasset_linkedhasset_sortedset_nevigatableset_treeset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo3 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Akshay");
		hs.add("Doma");
		hs.add(null);
		hs.add(10);
		hs.add("Akshay");
		hs.add(null);
		
		//System.out.println(hs);
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

/* Print element using Iterator cursor one by one.*/
