package akshay.enumclass;
/*group of name constant if you represent then we should be use enum class.
 * purpose of enum declare our data type.*/

public class EnumDemo1 {

	public static void main(String[] args) 
	{
		enum month //we can write enum inside the method also 
		{
			january,february,march;
		}
		System.out.println(month.march);
	}

}


/*Enum is keyword in java.
 *It is improvement from class.
 *enum is use to declare universal constant.
 *all universal constant are by default public,static and final.
 *an enum we can declare inside the class.
 *an enum we can declare outside the class
 *and we can declare inside the also.
 *enum are by default final so we can not extended.
 *every enum constant is by default object. */
 