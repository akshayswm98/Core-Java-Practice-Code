package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.LinkedList;

public class LinkedListDemo7 
{
	public static void main(String[] args) 
	{
		LinkedList<String> train = new LinkedList<String>();
		
		train.add("Coach A");
		train.add("Coach B");
		train.add("Coach C");
		System.out.println("Initial Train: " +train);
		
		train.addFirst("Engine");
		System.out.println("After Adding Engine at front: " +train);
		
		train.addLast("Gaurd Coach");
		System.out.println("After Adding Guard Coach at end: " +train);
		
		train.set(2, "Pantry Coach");
		System.out.println("After Adding Pantry Coach: "+ train);
		
		train.removeFirst();
		System.out.println("After Removing First Coach: "+ train);
		
		train.removeLast();
		System.out.println("After Remove Last Coch: "+ train);
	}
}
