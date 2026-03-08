package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Stack;

public class StackDemo1 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		try
		{
			s.push(12);
			s.push(14);
			s.push(16);
			s.push(11);
			s.push(22);
			System.out.println("After Inserting Lements :-"+s);
			
			System.out.println("Fetching the elements using pop method :");
			System.out.println(s.pop());//last in first out.22
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
			System.out.println("After deleting ements are :- "+s);//[]
			
			System.out.println(s.empty());//check stack is empty or not
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
