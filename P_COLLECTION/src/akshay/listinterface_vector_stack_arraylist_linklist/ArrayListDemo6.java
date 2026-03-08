package akshay.listinterface_vector_stack_arraylist_linklist;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo6 
{
	public static void main(String[] args) 
	{
		List<String> a = Arrays.asList("Akshay","vaibhav","pranjali","manisha");//length is fixed.
		
		
		Collections.sort(a);
		
		
		//Fetching elements using cursor.
		ListIterator<String> list = a.listIterator();
		
		System.out.println("Forward Direction");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println("Backward direction");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}
}
