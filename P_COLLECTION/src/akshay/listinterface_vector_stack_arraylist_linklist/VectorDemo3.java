package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class VectorDemo3 
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
			
			System.out.println(" 1.By using to string method");
			System.out.println(v1.toString());
			
			System.out.println("-------------------------------------------");
			System.out.println("2.by using fro loop");
			for(int i=0; i<v1.size();i++)
			{
				System.out.println(v1.get(i));
			}
			
			System.out.println("-------------------------------------------");
			System.out.println("3.by using for each loop");
			for (String city : v1) 
			{
				System.out.println(city);
			}
			
			System.out.println("--------------------------------------------");
			System.out.println("4.by using Enumeration Interface");
			Enumeration<String> elements = v1.elements();
			while(elements.hasMoreElements())
			{
				System.out.println(elements.nextElement());
			}
			
			System.out.println("---------------------------------------------");
			System.out.println("5.by using iterator Interface");
			Iterator<String> list = v1.iterator();
			while(list.hasNext())
			{
				System.out.println(list.next());
			}
			
			System.out.println("---------------------------------------------");
			System.out.println("6.by using ListIterator Interface");
			ListIterator<String> listI = v1.listIterator();
			
			System.out.println("*****Forward direction*****");
			while(listI.hasNext())
			{
				System.out.println(listI.next());
			}
			
			System.out.println("*****Backward direction*****");
			ListIterator<String> list1 = v1.listIterator(v1.size());
			while(list1.hasPrevious())
			{
				System.out.println(list1.previous());
			}
			
			System.out.println("---------------------------------------------");
			System.out.println("7.By using Spitorator Interafce");
			Spliterator<String> sp = v1.spliterator();
			sp.forEachRemaining(city -> System.out.println(city));
			
			System.out.println("-----------------------------------------------");
			System.out.println("8.By using for Each Method");
			v1.forEach(city -> System.out.println(city));
			
			System.out.println("------------------------------------------------");
			System.out.println("9.By using method reference");
			v1.forEach(System.out::println);
			
			System.out.println("-----------------------------------------------");
			System.out.println("10.By using Stream method");
			v1.stream().forEach(System.out::println);
			
			System.out.println("------------------------------------------------");
			System.out.println("11. by using parallel stream");
			v1.parallelStream().forEach(System.out::println);
		
			
		}
	}
}
