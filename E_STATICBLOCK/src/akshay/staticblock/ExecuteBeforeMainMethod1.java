package akshay.staticblock;

/*It is a special block when we will loading .class file then static block 
 is execute atomatically.
 we can use static block only for to initialise static variable.
 final static blank field only initialise in static block.
 */
//Static block executed before main method
public class ExecuteBeforeMainMethod1
{

	public static void main(String[] args) 
	{
		System.out.println("main method");
	}
	
	static
	{
		System.out.println("Static Block");
	}

}
