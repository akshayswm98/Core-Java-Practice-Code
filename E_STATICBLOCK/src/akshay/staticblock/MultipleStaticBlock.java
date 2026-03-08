package akshay.staticblock;
/*If more than static block then they will be 
 execute According the order. 
*/

class Demo
{
	static int x;
	
	static
	{
		x=100;
		System.out.println("x value of first block "+x);
	}
	
	static
	{
		x=200;
		System.out.println("x vlaue is second block "+x);
	}
	
	static
	{
		x=300;
		System.out.println("x value is third block "+x);
	}
}
public class MultipleStaticBlock 
{

	public static void main(String[] args) 
	{
		Demo dm = new Demo();
		
	}

}
