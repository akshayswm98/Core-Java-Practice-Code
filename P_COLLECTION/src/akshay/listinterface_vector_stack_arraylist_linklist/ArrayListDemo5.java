package akshay.listinterface_vector_stack_arraylist_linklist;
import java.util.*;
import java.util.Arrays;


//Fixed length arrays


public class ArrayListDemo5 
{
	public static void main(String[] args) 
	{
		List<Integer> fixLenghtArray = Arrays.asList(1,2,3,4,5,6);
		for (Integer integer : fixLenghtArray) 
		{
			System.out.println(integer);
		}
		
		System.out.println("--------------------------------------------------");
		//fixLenghtArray.add(22); unsuportedOperationException.
	}

}



/*java.util.Array class provide the predefined static method
  asList(T...x) :- It will create a fixed length arrays and return type of these method
  is list interface.
  
  In these fixed length arrays we can not perform add,remove,delete operation.
  otherwise we will get java.lang.UnsupportedOperationException. 
*/
