package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo5 
{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Akshay");
		list.add("Vijay");
		list.add("Gaurav");
		list.add("Kunal");
		
		
		
		System.out.println(list);
		
		ListIterator<String> li = list.listIterator();
		while(li.hasNext())
		{
			String cityName = li.next();
			
			if(cityName.equals("Vijay"))
			{
				li.remove();
			}
			else if(cityName.equals("Gaurav"))
			{
				li.add("Saurav");
			}
			else if(cityName.equals("Kunal"))
			{
				li.set("Rohit");
			}
			list.forEach(System.out::println);
		}
	}
}
