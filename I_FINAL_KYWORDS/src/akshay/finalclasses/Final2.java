package akshay.finalclasses;


final class Test
{
	private int data;
	
	public Test(int data)
	{
		this.data = data;
		System.out.println("Data value is : "+data);
	}
	@Override
	public String toString() 
	{
		return "Test [data=" + data + "]";
	}
	
}
public class Final2 
{
	public static void main(String[] args) 
	{
		Test t = new Test(100); // we can create object final class. 
		System.out.println(t);
	}

}

/*If our class logic is very important and we do not 
 want to share Sub class then developer modify the original
 behavior of the class then we Should declare as a final.*/
