package akshay.synchronized_method_block_staticsynchronized;
/*
import java.util.Scanner;

class BookTheaterSeats
{
	int totalSeats = 10;
	public void bookSeat(int seats)
	{
		if(totalSeats >= seats)
		{
			System.out.println("Seats Book Succesfully..!");
			totalSeats = totalSeats - seats;
			System.out.println("Seats Left "+totalSeats);
		}
		else
		{
			System.err.println("Sorry.Seats Can Not Be book..!");
			System.out.println("Seats Left "+totalSeats);
		}
	}
}

public class MovieBookingApp1 extends Thread
{
	static BookTheaterSeats b;
	int seats;
	@Override
	public void run() 
	{
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) 
	{
		b = new BookTheaterSeats();
		
		MovieBookingApp1 akshay = new MovieBookingApp1();
		akshay.seats = 6;
		akshay.start();
		
		
		
		MovieBookingApp1 kunal = new MovieBookingApp1();
		kunal.seats = 6;
		kunal.start();
		
		
		
	}

}
/*In that case problem is what we will create two thread.
 * both thread intering same time in business method so output provide wrong.
 * so avoid these problem we will use synchronized method.
 =============================================================================================================
 */
 

class BookTheaterSeats
{
	int totalSeats = 10;
	synchronized void bookSeat(int seats)
	{
		if(totalSeats >= seats)
		{
			System.out.println(seats+" Seats Book Succesfully..!");
			totalSeats = totalSeats - seats;
			System.out.println("Seats Left "+totalSeats);
		}
		else
		{
			System.err.println("Sorry.Seats Can Not Be book..!");
			System.out.println("Seats Left "+totalSeats);
		}
	}
}

public class MovieBookingApp1 extends Thread
{
	static BookTheaterSeats b;
	int seats;
	@Override
	public void run() 
	{
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) 
	{
		b = new BookTheaterSeats();
		
		MovieBookingApp1 akshay = new MovieBookingApp1();
		akshay.seats = 7;
		akshay.start();
		
		
		
		MovieBookingApp1 kunal = new MovieBookingApp1();
		kunal.seats = 6;
		kunal.start();
		
		
		
	}

}

/*synchronization is a keyword in java.
 * we can declare method as synchronized using synchronized keyword.
 * 
 * the main purpose of synchronized we will create multiple thread but synchronized accept only one thread.*/

