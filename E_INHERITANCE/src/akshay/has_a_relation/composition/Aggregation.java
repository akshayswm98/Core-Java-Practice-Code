package akshay.has_a_relation.composition;
/*We can Achieve Has a relation using Aggregation
 but weaker bond*/

class College
{
	private String clgName;
	private String clgLocation;
	
	public College(String clgName, String clgLocation) 
	{
		super();
		this.clgName = clgName;
		this.clgLocation = clgLocation;
	}

	@Override
	public String toString() 
	{
		return "College [clgName=" + clgName + ", clgLocation=" + clgLocation + "]";
	}
	
	
}

class Student
{
	private int stdId;
	private String stdName;
	private College college;//Has a relation
	
	public Student(int stdId, String stdName, College college) 
	{
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.college = college;
	}

	@Override
	public String toString() 
	{
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", college=" + college + "]";
	}
	
	
	
}
public class Aggregation 
{

	public static void main(String[] args)
	{
		System.out.println("Aggregation.main()");
		
		College clg = new College("SMT", "MANORA");
		Student std = new Student(101, "Akshay", clg);//Aggregation
		System.out.println(std);
	}

}
