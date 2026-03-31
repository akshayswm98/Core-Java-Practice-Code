package blankfinalfield;
/* Instance Non static variable declare with final keyword
   and at time of declaration is not be initialize then it is called as blank final field.
   
   Final field we can not initialize inside the method body.
   we will initialize only instance block and constructor only.
 */
class BlankFinal
{
	final String a; // blank final field
	
	{
		a = "Akshay";
	}
	
	public void show()
	{
		System.out.println("Execute Blank final variable. "+a);
	}
}

public class BlanckFinalDemo 
{

	public static void main(String[] args) 
	{
		BlankFinal bl = new BlankFinal();
		bl.show();
	}

}
