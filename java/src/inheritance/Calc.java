package inheritance;
 
public class Calc extends Inheritance
	{
	public static void main(String args[])
	{
		Calc obj=new Calc();
		            obj.add(2, 5);
		            obj.add(3.2,5.7);
		            obj.add(2,7,8);
		            obj.add(10,11.5);
		            obj.add(5,11.2,3);
	
	
	}
	
	void add (int a, double b, int c)
	{
		System.out.println(a+b+c);
	}
	
	}



