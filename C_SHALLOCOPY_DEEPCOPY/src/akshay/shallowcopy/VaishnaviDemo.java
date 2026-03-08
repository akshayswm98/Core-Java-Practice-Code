package akshay.shallowcopy;

class Vaishnavi
{
	private String name;
	private int age;
	
	
	public Vaishnavi(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() 
	{
		return "Vaishnavi [name=" + name + ", age=" + age + "]";
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}	
}

public class VaishnaviDemo 
{

	public static void main(String[] args) 
	{
		Vaishnavi v = new Vaishnavi("Akshay", 27);
		System.out.println(v);
		
        Vaishnavi v1 = v;// shallow copy
		
		System.out.println("After Modification:-");
		v1.setName("Sanika");
		v1.setAge(21);
		System.out.println(v);
		System.out.println(v1);
		
	}

}
