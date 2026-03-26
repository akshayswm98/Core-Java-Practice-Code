package akshay.mapinterface_hashmap_linkedhashmap_sortedmap_navigablemap_treemap;

import java.util.HashMap;

public class HashMapDemo3 
{
	public static void main(String[] args) 
	{
        HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Vanilla");
		map.put(2, "Butterscotch");
		map.put(3, "Chocolate");
		map.put(4, "Cotton Candy");
		
		//multiple null value accept
		map.put(5, null);
		map.put(6, null);
		map.put(7, null);
		
		//it will replace second null value with first null value
		//map.put(null, "Akshay");//multiple null key not accept.
		//map.put(null, "patil");//multiple null key 
		
		System.out.println(map.toString());
	}
}
