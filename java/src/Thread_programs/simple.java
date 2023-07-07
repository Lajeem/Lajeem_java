package Thread_programs;

public class simple 
{
public static void main(String args[]) throws InterruptedException
{
	Thread obj =new Thread ();
	Thread obj1=new Thread ();
	
	obj.start();
	obj1.start();
	Thread.sleep(1000);
	obj1.start();
	
	obj.join();
	obj1.join();
	System.out.println("completed");
}
}


	

