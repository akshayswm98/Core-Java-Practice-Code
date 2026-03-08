package akshay.interfacei;
/*Does not support constructor thats why we can achieve multiple inheritance*/
interface Alpha
{
	void m1();
}

interface Beta
{
	void m1();
}

class Implementer implements Alpha,Beta // multiple inheritace.
{
	@Override
	public void m1() 
	{
		System.out.println("Multiple inheritance we can achieve using interface..");
	}
}
public class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		Implementer i = new Implementer();
		i.m1();
	}

}
