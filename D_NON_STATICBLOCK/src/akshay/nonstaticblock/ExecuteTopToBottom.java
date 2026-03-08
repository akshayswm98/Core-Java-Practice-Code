package akshay.nonstaticblock;

// Execute Multiple instance block top to bottom
class Execute
{
	{
		System.out.println("1 st instance Block.");
	}
	
	{
		System.out.println("2nd instance Block.");
	}
	
	{
		System.out.println("3rd instance Block.");
	}
	
	{
		System.out.println("4 th instance Block.");
	}
}

public class ExecuteTopToBottom 
{

	public static void main(String[] args) 
	{
		new Execute();

	}

}
