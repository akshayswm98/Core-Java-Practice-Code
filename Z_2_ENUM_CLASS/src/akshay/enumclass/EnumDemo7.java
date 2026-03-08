package akshay.enumclass;

public class EnumDemo7 
{
	enum Season
	{
		SPRING,SUMMER,WINTER,FALL,RAINY;
	}

	public static void main(String[] args) 
	{
		Season[] s = Season.values();// fetch all constant from enum class.
		
		//print all constant 
		
		for (Season season : s) 
		{
			System.out.println(season);
		}
	}

}
