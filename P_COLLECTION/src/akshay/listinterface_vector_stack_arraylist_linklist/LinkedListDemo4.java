package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo4 
{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("Akshay");
		list.addLast("Patil");
		list.add("Babarao");
		
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		System.out.println("--------------------");
		
		List<String> listOfName = Arrays.asList("Akshay","Ankit","Rahul");
		
		LinkedList<String> l = new LinkedList<String>(listOfName);
		l.forEach(System.out::println);
	}
}
