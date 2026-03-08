package akshay.declaration_initialization;

public class ArraysInitialization2 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};
		
		//using for each loop

//		for (int i : a) 
//		{
//			System.out.print(i+",");
//		}
		
		//using for loop
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
