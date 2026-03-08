package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Vector;

public class VectorDemo5 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<>(100,10);
		System.out.println("Initial capacity is : "+v.capacity());
		
		for(int i = 0; i < 100; i++ )
		{
			v.add(i);
		}
		System.out.println("After Adding 100 Element capacity is : "+v.capacity());
		
		v.add(101);
		System.out.println("After Adding 101 element capacity is : "+v.capacity());
		
		for(int i=0; i<v.size(); i++)
		{
			if(i%5==0)
			{
				System.out.println();
			}
			System.out.println(v.get(i)+"\t");
		}
		
		
		
	}
}
