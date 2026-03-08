package akshay.type_of_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo3 
{
	public static void main(String[] args) 
	{
		Predicate<String> p4 = name -> name.equalsIgnoreCase("Akshay");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("You Are Akshay...?" +p4.test(name));
	}

}
