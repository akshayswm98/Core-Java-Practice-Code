package akshay.enumclass;

enum Month
{
	janu,feb,mar;
}
public class EnumDemo2
{
	enum Color
	{
		red,blue,black;
	}
	public static void main(String[] args) 
	{
		enum Day
		{
			sun,mon,tue;
		}
		System.out.println(Month.feb);
		System.out.println(Color.red);
		System.out.println(Day.tue);
	}
}

//we can defined enum inside class,outside class,inside method.