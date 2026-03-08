package akshay.lambda_functional_Interface_8fetures;

interface Calculator
{
	void doSum(int x, int y);
}
public class LambdaDemo3 
{
	public static void main(String[] args) 
	{
		// Lambda Expression
		Calculator c1 = (x,y)->
		{
			int z = x+y;
			System.out.println("Sum is "+z);
		};
		
		c1.doSum(12, 12);
//		
//		Calculator c1 = new Calculator()   // using Anonymous inner class
//		{
//			@Override
//			public void doSum(int x, int y) 
//			{
//				int z = x+y;
//				System.out.println("Sum is "+z);
//			}
//		};
//		c1.doSum(12, 12);
	}

}
