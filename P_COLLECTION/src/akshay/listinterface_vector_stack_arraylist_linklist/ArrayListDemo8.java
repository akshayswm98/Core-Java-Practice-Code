package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo8 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("hyderabad");
		cities.add("Banglore");
		cities.add("manglore");
		cities.add("mumbai");
		
		System.out.println("brfore sorting city : "+cities);
		
		Collections.sort(cities);
		//Ascending Order.
		System.out.println("Ascending Order : "+cities);
		
		
		//Descending Order
		Collections.sort(cities,Collections.reverseOrder());
		System.out.println(cities);

		
	}
}
