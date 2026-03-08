package akshay.upcastingdauncasting;

class Person
{
	public int age()
	{
		return 35;
	}
	
	public void printAge()
	{
		System.out.println(age());
	}
}

class Student extends Person
{
	@Override
	public int age() {
		return 22;
	}
}
public class OverridingDemo3 {

	public static void main(String[] args) {
		Person p = new Student();
		p.printAge();

	}

}