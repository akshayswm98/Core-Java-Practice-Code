package akshay.methodhiding;

class Majanu
{
	public static void coldLove()
	{
		System.out.println("make a cool love");
	}
}

class Laila extends Majanu
{
	
	public static void coldLove()
	{
		System.out.println("make hot love");
	}
}
public class MethodHidingDemo5 
{
	public static void main(String[] args) 
	{
		Majanu love = new Laila(); 
		love.coldLove();
	}

}
/*If write static method in sub class with same signature and compatable return type
  then it is not an overriden method, Actually it is method hiding.
  Here Sub class static method hiding super class static method.
  we can not use @Override Annotation with static method otherwise
  compilation error.*/
