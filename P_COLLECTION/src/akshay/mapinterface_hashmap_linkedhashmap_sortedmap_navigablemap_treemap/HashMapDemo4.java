package akshay.mapinterface_hashmap_linkedhashmap_sortedmap_navigablemap_treemap;

import java.util.HashMap;

public class HashMapDemo4 
{
	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "Butterscotch");
		map.put(4, "Cotton Candy");
		map.put(3, "Chocolate");
		map.put(1, "Vanilla");
		
		
		System.out.println(map);
	}
}
// HashMap are not following insertion and sorting order.