package Workout;

public class First_value 
{
	public static void main(String args[])
	{
		First_value obj=new First_value();
		obj.number();
		obj.number1();
	}
	void number()
	{
		int a=123;
		
		while(a>0)
		{
		int	b=a/100;
		System.out.println("first value = "+b);
		break;
		}		
	}
	void number1()
	{
	
	 int c=152;
	 
	 while(c>0)
	 {
		int b=c%10;
		System.out.println(" last value = "+b);
		break;
	 }
	 }
	

}









