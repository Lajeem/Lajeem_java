package Thread_programs;

public class Static_runnable 
{
	public static void main (String args[])
	{
		Runnable k1 = new First();
		Runnable k2 = new Second();
		
		Thread d1 = new Thread(k1);
		Thread d2 =new Thread (k2);
		
		d1.start();
		d2.start();
	}
}
