package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;

//Add all element of array list
public class ArrayListDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<>(100);
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		
		int sum = 0;
		for (Integer integer : a) 
		{
			sum = sum + integer ;
		}
		System.out.println("Sum of the : "+sum);
		
	}
}
