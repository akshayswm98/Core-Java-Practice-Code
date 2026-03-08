package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo2 
{
	public static void main(String[] args) 
	{
		final int ITERATION = 100000;
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<=ITERATION; i++)
		{
			al.add(0,1);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken by ArrayList class :"+(endTime - startTime)+ " ms");
		startTime = System.currentTimeMillis();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=0; i<=ITERATION; i++)
		{
			list.add(0,1);
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Time Taken By linkedlist class : "+(endTime-startTime)+ "ms");
	}
}
