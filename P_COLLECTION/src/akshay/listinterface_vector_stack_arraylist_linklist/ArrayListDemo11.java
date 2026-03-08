package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;

public class ArrayListDemo11 
{
	public static void main(String[] args) 
	{
		ArrayList<String> original = new ArrayList<String>();
		original.add("BCA");
		original.add("MCA");
		original.add("BBA");
		
		System.out.println("By using clone method");
		
		ArrayList<String> cloned = (ArrayList<String>)original.clone();
		System.out.println(cloned);
		
		System.out.println("By using copy constructor");
		
		ArrayList<String> n = new ArrayList<String>(original);
		System.out.println(n);
		
		
	}
}
