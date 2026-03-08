package akshay.instanceofkeyword;

/*Instanceof is one of the keywords in java and also is the
  relational operator in java.
  Instanceof operator will return true or false 
  It is use to a reference variable is pointing to a perticular
  type of object or not
  in between reference variable and class OR interface type, 
  we must have IS-A relation otherwise 
  will get the compilation error. */
class Alpha
{
	
}
class Beta extends Alpha
{
	
}
class Gama extends Beta
{
	
}
public class InstanceOfDemo1 {

	public static void main(String[] args) {
		Gama g = new Gama();
		if (g instanceof Gama)
		{
			System.out.println("g is pointing to gama object");
		}
		if (g instanceof Beta)
		{
			System.out.println("g is pointing to Beta object");
		}
		if (g instanceof Alpha)
		{
			System.out.println("g is pointing to Alpha object");
		}
		if (g instanceof Object )
		{
			System.out.println("g is pointing of Object");
		}
		
	}

}
