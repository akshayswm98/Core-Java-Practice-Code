package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo9 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println("Print Value Forward Direction.");
		ListIterator<String> li = list.listIterator();
		while(li.hasNext())
		{
			int nextIndex = li.nextIndex();
			String value = li.next();
			System.out.println("Index "+nextIndex+ " -> "+value);
		}
		System.out.println("========================================");
		System.out.println("Print Value Backward Direction");
		
		while(li.hasPrevious())
		{
			int prevIndex = li.previousIndex();
			String value = li.previous();
			System.out.println("Index "+prevIndex+" -> "+value);
			
		}
		
		System.out.println("\nStart Iterator from Index 2.");
		
		ListIterator<String> li2 = list.listIterator(2);
		while(li2.hasNext())
		{
			System.out.println("Index "+li2.nextIndex()+" -> "+li2.next());
		}
	}
}
