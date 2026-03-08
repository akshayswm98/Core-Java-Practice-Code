package akshay.nonstaticblock;

/* It Is special block in java.Instance block executed at 
  the time of creating object and execute before constructor
  
  The main purpose of instance block to execute non static variables,
  and also use of providing common message to All objects.
  it is also known as instance initializer.
*/
class Instance
{
	//instance block
	{
		System.out.println("Instance Or Non Static Block");
	}
}

public class InstanceBlock 
{

	public static void main(String[] args) 
	{
		new Instance();
		new Instance();
	}

}
