package akshay.finalmethod;

class Alpha
{
	private final void accept() //private method
	{
		System.out.println("Alpha class accept method");
	}
}

class Beta extends Alpha
{
	public void accept()  //concreate method..there is no relation super class method with sub class.
	{                     // super class method not visible in sub class so no error.
		System.out.println("Beta class Accept method");
	}
}

public class FinalMethod2 
{
	public static void main(String[] args) 
	{
	new Beta().accept();
	}
}
