package akshay.java_8_features;
/*Static method also feature of java 8v*/

interface Calculator
{
	static double doSum(double x, double y)
	{
		return (x+y);
	}
	
	static double doSquere(double x)
	{
		return (x*x);
	}
}
public class StaticMethod 
{
	public static void main(String[] args) 
	{
		double result = Calculator.doSum(12, 400);
		System.out.println("Result is . "+result);
		
		result = Calculator.doSquere(2);
		System.out.println("Squere is . "+result);
	}

}
