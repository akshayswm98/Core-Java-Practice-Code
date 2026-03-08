package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Vector;
import java.util.function.Consumer;

public class VectorDemo2 
{
	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<String>();
		{
			v1.add("Hyderabad");
			v1.add("Kolkatta");
			v1.add("Pune");
			v1.add("Indore");
			v1.add("Mumbai");
			v1.add("Washim");
			
			v1.forEach(city -> System.out.println(city.toUpperCase()));
		}
	}
}
