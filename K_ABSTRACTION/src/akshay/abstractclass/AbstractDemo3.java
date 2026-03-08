package akshay.abstractclass;
abstract class Hello
{
	public void m1()// concrete method only in abstract class.
	{
		System.out.println("Concreate method");
	}
}

class Hi extends Hello
{
	
}
public class AbstractDemo3 {

	public static void main(String[] args) {
		Hello h = new Hi();
		h.m1();
	}

}


/*An Abstract class may contain only Concrete method*/