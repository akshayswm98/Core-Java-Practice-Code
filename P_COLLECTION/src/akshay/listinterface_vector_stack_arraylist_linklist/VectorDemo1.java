package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Vector;
import java.util.function.Consumer;

public class VectorDemo1 
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
			
			//Anonymous Inner Class.
			Consumer<String> c = new Consumer<String>() 
			{
				@Override
				public void accept(String c) 
				{
					System.out.println(c.toUpperCase());
				}
			};
			v1.forEach(c);
		}
	}

}


/*forEach():- method are available from JDK 1.8v
 * method are used to iterate the element from the source.
 * method are internally use for each loop.*/
 