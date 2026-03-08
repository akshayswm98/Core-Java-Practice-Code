package akshay.enumclass;

enum Pizza //every enum are by default final so can't inherited. 
{
	SMALL,BIG,MEDIUM;
}
public class EnumDemo6 //Extends pizza
{

	public static void main(String[] args) 
	{
		System.out.println(Pizza.BIG);
	}

}
