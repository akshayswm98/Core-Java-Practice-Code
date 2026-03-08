package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

//add is the vector class method
public class StackDemo2 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.add(12);
		s.add(20);
		s.add(40);
		System.out.println(s.toString());//print all elements
		
		//Ascending order
		Collections.sort(s);
		System.out.println("Ascending order :- "+s);
		
		//Descending order
		Collections.sort(s,Collections.reverseOrder());
		System.out.println("Descending order :- "+s);
		
		//homogeneous and heterogeneous data.
		Stack s1 = new Stack();
		s1.push(12);
		s1.push("Akshay");
		s1.push('c');
		System.out.println("Using peek method :- "+s1.peek());
		System.out.println("using empty method :- "+s1.empty());
		System.out.println("Print Stack ELements Homogeneous and hetrogeneous data : "+s1);
	}
}
