package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Stack;

public class StackDemo3 
{
	public static void main(String[] args)
	{
		Stack<String> stk = new Stack<String>();
		stk.push("Apple");
		stk.push("Graps");
		stk.push("Mango");
		stk.push("Dragon");
		
		System.out.println("Ofset Positon Is :- "+stk.search("manogo"));
		System.out.println("Ofset Position Is :- "+stk.search("Dragon"));
		System.out.println("Is stack empty :- "+stk.empty());
		System.out.println("Index Position :- "+stk.indexOf("Graps"));
		System.out.println("Size Of Stack :- "+stk.size());
		System.out.println("Last element is :- "+stk.lastElement());
		System.out.println("First elements is :- "+stk.firstElement());
	}
}
