package akshay.type_of_functional_interface;

import java.util.Scanner;
import java.util.function.Function;

/*It is also predefined Functional interface.
 *It Accept two type parameter T and R.
 *It has a Abstract method apply(), which accept T as a parameter and R is the return result.*/
public class FunctionDemo1 
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> fn = num -> num*num*num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		System.out.println("Cube Of :"+num+" is : "+fn.apply(num));
	}

}
