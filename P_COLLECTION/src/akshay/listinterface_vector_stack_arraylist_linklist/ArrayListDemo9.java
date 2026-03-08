package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;

public class ArrayListDemo9 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add("Akshay");
		a1.add(12);
		a1.add(3, "hyderabad");
		a1.add(1,"patil");
		a1.add(null);
		a1.add(11);
		System.out.println(a1);
	}
}
