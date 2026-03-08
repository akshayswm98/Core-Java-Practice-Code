package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo12 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		//It will print ele from index to upTo to index.
		List<Integer> subList = list.subList(2, 5);
		System.out.println(subList);
		
		System.out.println("..............................................");
		
		// it will boolean contain(Object obj)
		boolean contains = list.contains(9);
		System.out.println(contains);
				
		System.out.println("..............................................");
		
		
		System.out.println(list.indexOf(2));
		
		System.out.println("..............................................");
		
		//check condition and print 
		list.removeIf(num -> num%2 == 1);
		list.forEach(System.out::println);
		
	}
}
