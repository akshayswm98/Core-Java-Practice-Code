package akshay.setinterface_hashset_linkedhashset_sortedset_nevigatableset_treeset;

import java.util.TreeSet;

public class TreeSetDemo3 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add("Akshay");
		ts.add("patil");
		System.out.println(ts);
	}
}

/*we can store only homogeneous elements. otherwise RE*/