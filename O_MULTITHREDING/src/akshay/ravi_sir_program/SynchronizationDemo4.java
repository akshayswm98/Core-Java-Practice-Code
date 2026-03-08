package akshay.ravi_sir_program;

class Cinema
{
	int availableTicket = 20;
	
	synchronized void bookTicket(int seats)
	{
		String name = Thread.currentThread().getName();
		
		if(availableTicket >= seats)
		{
			availableTicket = availableTicket - seats;
			System.out.println(name + " " + seats + " Seats Book Succefully...!");
			System.out.println("Available Seat " + availableTicket);
		}
		else
		{
			System.out.println(name + " You Have Insufficient Seats.");
		}
	}
}
public class SynchronizationDemo4 extends Thread
{
	static Cinema cinema;
	int seats;
	
	public SynchronizationDemo4(int seats) 
	{
		this.seats = seats;
	}
	
	@Override
	public void run() 
	{
		cinema.bookTicket(seats);
	}

	public static void main(String[] args) 
	{
		cinema = new Cinema();
		
		SynchronizationDemo4 t1 = new SynchronizationDemo4(12);
		SynchronizationDemo4 t2 = new SynchronizationDemo4(13);
		
		t1.setName("Akshay");
		t2.setName("Vaibhav");
		
		t1.start();
		t2.start();
	}

}
