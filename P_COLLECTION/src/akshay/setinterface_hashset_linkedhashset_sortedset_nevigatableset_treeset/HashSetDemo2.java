package akshay.setinterface_hashset_linkedhashset_sortedset_nevigatableset_treeset;

import java.util.HashSet;

public class HashSetDemo2 
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
		System.out.println(hs);
	}

}
/* Does not stored duplicates elements.
 * we can stored elements heterogeneous and homogeneous ele.
 * does not stored multiple null value.
 * does not follow insertion and sorting order.*/
 