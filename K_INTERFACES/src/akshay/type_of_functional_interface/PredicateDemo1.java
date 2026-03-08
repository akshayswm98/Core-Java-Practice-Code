package akshay.type_of_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

/*It is Predefined Functional interface.,java.util.function sub package.
 *It Contained abstract method test() which accept 'T' is a parameter and return type is boolean.
 *It is mainly used to Verify "one argument boolean expression"*/


public class PredicateDemo1 {

	public static void main(String[] args) 
	{
		Predicate<Integer> p1 = num -> num % 2==0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println(num+" is Even number..? so -> "+p1.test(num));
	}

}
