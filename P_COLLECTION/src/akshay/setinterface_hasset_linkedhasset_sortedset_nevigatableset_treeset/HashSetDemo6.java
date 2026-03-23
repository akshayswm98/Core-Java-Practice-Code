package akshay.setinterface_hasset_linkedhasset_sortedset_nevigatableset_treeset;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo6 
{
	public static void main(String[] args) 
	{
		Boolean values[] = new Boolean[5];
		
		HashSet<Object> hs = new HashSet<>();
		values[0] = hs.add(12);
		values[1] = hs.add(12);
		values[2] = hs.add(13);
		values[3] = hs.add(13);
		values[4] = hs.add(new String("java"));
		
		System.out.println(Arrays.toString(values));
		
	}
}

/*List interface add() method always return true but set interface add() method
  will return true or false base on the type of object.*/
 