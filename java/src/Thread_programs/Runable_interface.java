package Thread_programs;

	public class Runable_interface implements Runnable
	{
		public static void main(String args[])
			{
				Runnable s1 = new Runable_interface ();
				Runnable s2 = new Runable_interface ();
				
				Thread r1 =new Thread (s1);
				Thread r2 =new Thread (s2);
				
				r1.start();
				r2.start();
			}

		@Override
		public void run() 
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println( "7"+"*"+i+"="+i*7);
				try 
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
		    }		
		}
	}
