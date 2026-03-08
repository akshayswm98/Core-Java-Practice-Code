package akshay.type_of_functional_interface;

import java.util.Scanner;
import java.util.function.Function;

//Finding the length of given name.
public class FunctionDemo2 
{
	public static void main(String[] args) 
	{
		Function<String, Integer> fn = name-> name.length();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		Integer length = fn.apply(name);
		
		System.out.println("Length Of "+name+" is : "+length);
	}

}
