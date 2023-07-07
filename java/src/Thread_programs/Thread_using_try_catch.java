package Thread_programs;

	public class Thread_using_try_catch extends Thread
	{
		public static void main(String args[]) throws InterruptedException
			{
			Thread t1 =new Thread_class_using_extends();
			Thread t2 =new Thread_class_using_extends();
			t1.start();
			Thread.sleep(1000);
			t2.start();	
		}
			public void run()
				{
					for(int i=1;i<=10;i++)
					{
						try
						{
							Thread.sleep(1000);
						}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println(i +" = hai");
				}
			}
	}
	
