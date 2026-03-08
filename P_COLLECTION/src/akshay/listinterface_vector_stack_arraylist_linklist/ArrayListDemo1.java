package akshay.listinterface_vector_stack_arraylist_linklist;
//remove duplicate using HashSet class.
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("ArrayListDemo1.main()");
		
		ArrayList<String> listOfFruit = new ArrayList<String>();
		listOfFruit.add("Apple");
		listOfFruit.add("Apple");
		listOfFruit.add("Orange");
		listOfFruit.add("Mango");
		listOfFruit.add("papaya");
		System.out.println("My Array List :- "+listOfFruit );
		
		//remove duplicate using HashSet class.
		HashSet<String> h = new HashSet<String>(listOfFruit);
		h.forEach(System.out::println);
	}
}
