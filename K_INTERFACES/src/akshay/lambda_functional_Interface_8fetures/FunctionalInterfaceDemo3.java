package akshay.lambda_functional_Interface_8fetures;

@FunctionalInterface // whenever declare annotation,is providing restriction,show error can not take more than one method 
interface House      // otherwise compilation error.
{
	void bedRoom();
	
}

class Akshay implements House
{
	@Override
	public void bedRoom() 
	{
		System.out.println("this bedroom is for Akshay.");
	}
}
public class FunctionalInterfaceDemo3 
{
	public static void main(String[] args) 
	{
		Akshay ak = new Akshay();
		ak.bedRoom();
	}

}
