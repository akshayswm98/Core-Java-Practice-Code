package akshay.setinterface_hashset_linkedhashset_sortedset_nevigatableset_treeset;

import java.util.TreeSet;

public class TreeSetDemo2 
{
	private void maian() 
	{
		TreeSet ts = new TreeSet();
		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add(40);
		ts.add(20);
		ts.add(null);
		System.out.println(ts);
	} 
}
/*It Is not accepted duplicate elements and single null value also.*/
