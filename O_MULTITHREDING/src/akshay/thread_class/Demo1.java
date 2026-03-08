package akshay.thread_class;
class Demo extends Thread
{
	@Override
	public void run() //using run method assign task 
	{
		// assign new task
	}
}
public class Demo1 {

	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.start();//creating thread and internally called run method
	}

}
