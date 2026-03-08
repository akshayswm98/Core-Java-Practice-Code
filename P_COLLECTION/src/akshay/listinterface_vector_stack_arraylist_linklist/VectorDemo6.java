package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo6 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		int x[] = {22,60,20,20,15,40,55};
		
		//adding elements into vector
		
		for(int i=0; i<x.length; i++)
		{
			v.add(x[i]);
		}
		
		System.out.println("Originel Arrays : "+v);
		
		//Sorting 
		Collections.sort(v);
		//Ascending order
		System.out.println("Assending Arrays : "+v);
		
		//reverse element
		Collections.reverse(v);
		System.out.println("reverse element : "+v);
		
		System.out.println("Maximmum elements : "+Collections.max(v));
		System.out.println("Minimmum elements : "+Collections.min(v));
		
		// To convert Collection to arrays
		
		Object[] array = v.toArray();
		System.out.println(Arrays.toString(array));
		
	}
}
