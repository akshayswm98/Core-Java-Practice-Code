package akshay.abstractclass;
/*Abstract Method Overriding Is a compulsory in implemented class otherwise compilation error.*/
abstract class NeedToUseAbstractMethod
{
	public abstract void usingMethod(); // abstract method
}

class NotUsing extends NeedToUseAbstractMethod // CE
{
	public static void demo()
	{
		System.out.println("My Demo Method");
	}
}
public class AbstractDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
