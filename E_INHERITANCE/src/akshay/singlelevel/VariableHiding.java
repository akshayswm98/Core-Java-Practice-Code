package akshay.singlelevel;

/* When sub class variable hide super class variable, in this situation we should use 
 super keywords to call parents class variable.
 
 and also we can use to call super class method and constructor
*/
class Father
{
	protected double balance = 5000;
}

class Son extends Father
{
	protected double balance = 3000;// variable hiding
	
	public void showBalance()
	{
		System.out.println("Father Balance is = "+super.balance);
		System.out.println("Son Balance is = "+this.balance);
	}
}


public class VariableHiding 
{

	public static void main(String[] args) 
	{
		Son son = new Son();
		son.showBalance();
	}

}
