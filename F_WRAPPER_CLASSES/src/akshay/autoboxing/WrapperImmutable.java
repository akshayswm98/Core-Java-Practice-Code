package akshay.autoboxing;
/*Output is 100 that means Integer class is immutable*/
public class WrapperImmutable 
{

	public static void main(String[] args) 
	{
		Integer i = new Integer(100);
		accept(i);
		System.out.println(i);
	}
	public static void accept(Integer j)
	{
		j = 999;
	}
}
