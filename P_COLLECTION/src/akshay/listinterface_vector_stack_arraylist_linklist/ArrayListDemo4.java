package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;

public class ArrayListDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Akshay");
		a1.add("Vaibhav");
		a1.add("Rahul");
		a1.add("Mayur");
		a1.add("Mayank");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Sneha");
		a2.add("Payal");
		a2.add("Nikita");
		
		//Copy a2 elements in a1
		a1.addAll(a2);
		
		System.out.println("Size of a1 : "+a1.size());
		
		a1.forEach(str -> System.out.println(str.toUpperCase()));
		
		System.out.println("------------------------------------------------------------");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("shrredevi");
		a3.add("sai pallavi");
		a3.add("Rashmika");
		a3.add("pooja hegade");
		
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("Allu Arjun");
		a4.add("Vijay");
		a4.add("NTR");
		
		
		a3.addAll(a4);
		
		//to print using for each loop.
		for (String str : a3) 
		{
			System.out.println(str.toUpperCase());
		}
		
	}
}
