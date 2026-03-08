package akshay.abstractclass;
abstract class Error
{
	public abstract void errorMsg();
	{
		System.out.println("Abstract body");// is not consider Abstract method body it will 
	                                   // jvm Consider as non static block.
	}
	
}

class HandleError extends Error
{

	@Override
	public void errorMsg() {
		System.out.println("ovverride method");
	}
	
}
public class AbstractDemo5 {

	public static void main(String[] args) {
		
		HandleError er = new HandleError();
		er.errorMsg();
	}

}
/*If we try to implement Abstract method body. but jvm consider it is not Abstract method body is a non static block.*/