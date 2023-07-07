package Firstpackage;

public class Tiger implements Mammal  // interface model child class name Tiger
{
	public void sleep()
	{
		System.out.println("Tiger sleep");
	}
	public void eat()
	{
		System.out.println("Tiger will eat");
	}

		public static void main(String args[])
		{
			Mammal obj= new Tiger();
				   obj.sleep();
				   	obj.eat();
				   	
		}
}
