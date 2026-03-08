package akshay.enumclass;

public class EnumDemo4 
{
	private enum Season
	{
		Spring,Summer,Winter,Rainy;
	}

	public static void main(String[] args) 
	{
		System.out.println(Season.Spring);
	}

}

/*If we declare enum inside class then we can declare enum as private,protected,public also.*/
