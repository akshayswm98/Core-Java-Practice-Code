package akshay.autoboxing;
/*We should use Wrapper concept to convert 
 primitive data into Wrapper Object. 
 1.Autoboxing:-we can use to convrt primitive data into Wrapper object.
 2.Unboxing :-we can use to convrt Wrapper object into primitive*/
public class Autoboxing1 
{

	public static void main(String[] args) 
	{
		int a =12;
		Integer x = Integer.valueOf(a);
		System.out.println(x);
	}

}
/*valueOf(int x):- this method we can use to convert primitive data into wrapper object.*/