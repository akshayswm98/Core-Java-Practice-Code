package akshay.multilevelInheritance;

class Student
{
	protected int id;
	protected String name;
	protected String address;
	
	public Student(int id, String name, String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ",address=+" + address + "]";
	}
}

class Science extends Student
{
	protected int physics;
	protected int chemistry;
	
	public Science(int id, String name, String address, int physics, int chemistry) 
	{
		super(id, name, address);
		this.physics = physics;
		this.chemistry = chemistry;
	}

	@Override
	public String toString() 
	{
		return super.toString()+"Science [physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	
}

class PCM extends Science
{
	protected int math;

	public PCM(int id, String name, String address, int physics, int chemistry, int math) 
	{
		super(id, name, address, physics, chemistry);
		this.math = math;
	}

	@Override
	public String toString() 
	{
		return super.toString()+ "PCM [math=" + math + "]";
	}
	
	
}
public class MultilevelDemo1 
{

	public static void main(String[] args) 
	{
		PCM p = new PCM(101, "Akshay", "Ameerpet", 70, 40, 90);
		System.out.println(p);
	}

}
