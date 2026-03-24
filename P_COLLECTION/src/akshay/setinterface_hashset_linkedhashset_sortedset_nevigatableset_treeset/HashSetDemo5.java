package akshay.setinterface_hashset_linkedhashset_sortedset_nevigatableset_treeset;

import java.util.HashSet;

public class HashSetDemo5 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Ravi");
		hs.add("Ajay");
		hs.add(null);
		hs.add("Sweta");
		hs.add(null);
		
		hs.forEach(System.out::println);
    }
}

/*print Randomly and not printed multiple null value and not allowed duplicates.*/
