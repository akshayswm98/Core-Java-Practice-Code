package akshay.mapinterface_hashmap_linkedhashmap_sortedmap_navigablemap_treemap;

import java.util.HashMap;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Vanilla");
		map.put(2, "Butterscotch");
		map.put(3, "Chocolate");
		map.put(4, "Cotton Candy");
		
		System.err.println("By using toString method");
		System.out.println(map.toString());
		
		System.err.println("By using for each method");
		map.forEach((key,value)-> System.out.println(key +" -> "+value));
		
		
		String hasKey = map.get(3);//get value from key
		System.err.println("Get value from key");
		System.out.println(hasKey);
		
		String value = map.getOrDefault(3, "key is not available");
		System.err.println("Value for key 3 "+value);
		
		System.err.println("4 Key is Available or not ");
		System.out.println(map.containsKey(4));//check
		
		System.err.println("Butterscotch Is available or not ");
		System.out.println(map.containsValue("Butterscotch"));
		
		map.remove(1);//remove key with value
		System.err.println("HashMap After removing key 1");
		System.out.println(map);
		
		int size = map.size();//check size of HashMap
		System.err.println("HashMap Size ");
		System.out.println(size);
		
	    map.clear();//delete all map
	    System.out.println("Hash Map afeter cleaning "+map);
	    
	   boolean check = map.isEmpty();
	    System.out.println("check empty or not "+check);
	}
}
