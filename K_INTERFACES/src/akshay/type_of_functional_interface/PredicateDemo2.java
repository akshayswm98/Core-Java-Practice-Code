package akshay.type_of_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 
{
	public static void main(String[] args) 
	{
		Predicate<String> st = name -> name.toUpperCase().startsWith("A");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.next();
		
		System.out.println(name +" Start With A..? "+st.test(name));
	}

}
