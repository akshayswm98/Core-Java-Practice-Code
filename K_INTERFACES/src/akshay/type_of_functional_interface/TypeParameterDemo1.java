package akshay.type_of_functional_interface;
/*Type parameter is only deals with wrapper class.
 * Actually it is generic concept.
 * we can declare object type at the time of compilation.
 * no type casting.*/
class Box<T>
{
	private T data;
	
	public Box (T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return data;
	}
}
public class TypeParameterDemo1 
{
	public static void main(String[] args) 
	{
		Box<Integer> intType = new Box<Integer>(14);
		System.out.println("Integer Type "+intType.getData());
		
		Box<Double> douType = new Box<Double>(90.67);
		System.out.println("Double Type "+douType.getData());
		
		Box<Character> charType = new Box<Character>('A');
		System.out.println("Character is "+charType.getData());
	}

}
