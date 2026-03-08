package akshay.lambda_functional_Interface_8fetures;
interface Printable
{
	void print();
}

public class LambdaDemo1 
{
	public static void main(String[] args) 
	{
		Printable p = () -> System.out.println("Printing");
		p.print();
	}

}


/*It Is a new feature of java 1.8v
 
 * it is an improvement over Anonymous inner class
 
 * we do not need write the following defining method
 * Access Modifier of the method is not required.
 * Return type of the is not required.
 * method name also is not required.
 * Data types is also not required 
 
  Generally we can use to concise code. avoid boilerplate code.  */
 