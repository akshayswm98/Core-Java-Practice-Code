package akshay.singlelevel;

/*If The Super Class Method And Sub Class Non Static Method 
 name both are exactly same, and if we crate object for sub class 
 then sub class method will be executed, if we want to call super class method in
 sub class method body we should use super keyword.*/

class Alpha
{
	public void display()
	{
		System.out.println("Alpha Class Display");
	}
}


class Beta extends Alpha
{
	public void display()
	{
		super.display();
		System.out.println("Beta Class Display");
	}
}

public class MethodOvrridingSuperK 
{

	public static void main(String[] args) 
	{
		Beta b1 = new Beta();
		b1.display();
	}

}
