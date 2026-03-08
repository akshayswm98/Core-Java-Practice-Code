package akshay.synchronized_method_block_staticsynchronized;

class BookTheaterApp
{
	static int total_seats = 20;
	static synchronized void bookSeats(int seats)
	{
		if(total_seats >= seats)
		{
			System.out.println(seats + " seats book successfully.");
			total_seats = total_seats-seats;
			System.out.println("seats left : "+total_seats);
		}
		else
		{
			System.out.println("seats can not be book");
			System.out.println("seats left : "+total_seats);
		}
	}
}

class Mythread1 extends Thread
{
	BookTheaterApp b;
	int seats;
	public Mythread1(BookTheaterApp b, int seats) 
	{
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run() 
	{
		b.bookSeats(seats);
	}
	
}

class Mythread2 extends Thread
{
	BookTheaterApp b;
	int seats;
	public Mythread2(BookTheaterApp b, int seats) 
	{
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run() 
	{
		b.bookSeats(seats);
	}
	
}

public class MovieBookingApp1StaticSynchronization 
{
	public static void main(String[] args) 
	{
		BookTheaterApp b1 = new BookTheaterApp();
		Mythread1 t1 = new Mythread1(b1, 7);
		t1.start();
		
		
		Mythread1 t2 = new Mythread1(b1, 6);
		t2.start();
		
		BookTheaterApp b2 = new BookTheaterApp();
		
		Mythread1 t3 = new Mythread1(b2, 5);
		t3.start();
		
		Mythread2 t4 = new Mythread2(b2, 9);
		t4.start();
	}

}
