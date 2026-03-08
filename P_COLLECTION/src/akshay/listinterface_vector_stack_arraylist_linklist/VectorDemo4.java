package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo4 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		list.add("Washim");
		list.add("yavatmal");
		list.add("amravati");
		list.add("ghatanji");
		list.add("nagpur");
		list.add("pulgaon");
		
		System.out.println("Before Sorting List Of city : "+list);
		
		System.out.println("---------------------------------------");
		
		// Sorting (Ascending)
		Collections.sort(list);
		System.out.println("After Sorting List Of city (Ascending) : " + list);
		System.out.println("----------------------------------------------");
		
		System.out.println("Reverse Order");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("-------------------------------------------");
		
		System.out.println("Remove the element using object.");
		list.remove("nagpur");
		System.out.println(list);
		System.out.println("----------------------------------------------");
		
		System.out.println("remove the element using index");
		list.remove(2);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		
		
		
			
	}
}
