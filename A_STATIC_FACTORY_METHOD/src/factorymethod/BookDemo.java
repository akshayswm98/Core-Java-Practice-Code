package factorymethod;

/* those method whose return type is class , interface that means from method we can 
   return the object then it is called static
   factory method.
   */
class Book
{
	private String title;
	private String auther;
	
	public Book(String title, String auther) 
	{
		super();
		this.title = title;
		this.auther = auther;
	}

	@Override
	public String toString() 
	{
		return "Book [title=" + title + ", auther=" + auther + "]";
	}
	
	public static Book getBook() // Factory method
	{
		return new Book("Akshay", "Patil");
	}
	
	
}
public class BookDemo 
{

	public static void main(String[] args) 
	{
		Book book = Book.getBook();
		System.out.println(book);

	}

}
