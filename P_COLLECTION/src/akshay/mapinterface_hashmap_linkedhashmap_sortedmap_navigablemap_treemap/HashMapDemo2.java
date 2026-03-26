package akshay.mapinterface_hashmap_linkedhashmap_sortedmap_navigablemap_treemap;

import java.util.HashMap;

public class HashMapDemo2 
{
	public static void main(String[] args) 
	{
        HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Vanilla");
		map.put(2, "Butterscotch");
		map.put(3, "Chocolate");
		map.put(4, "Cotton Candy");
		map.put(5, "Vanilla");//duplicate value.
		//map.put(1, "MilkButter");//duplicate key.
		
		System.out.println(map.toString());
	}
}
/*whenever we put duplicate key it replace value.
  means duplicate key not accept. but duplicate value accept.*/
 