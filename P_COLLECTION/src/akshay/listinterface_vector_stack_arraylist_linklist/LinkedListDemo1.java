package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.LinkedList;

public class LinkedListDemo1 
{
	public static void main(String[] args) 
	{
		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add("Akshay");
		l1.add("Patil");
		l1.add(null);
		l1.add(42);
		
		System.out.println("1st Position is :- "+l1.get(1));
		
		l1.forEach(System.out::println);
	}
}
