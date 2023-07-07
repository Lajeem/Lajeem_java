package Realtime;

public class Currency_conversion // dollar to inr = 82.81 
								 // inr to dollar = 0.012
{
	public void numbers(double a)
	{
		double inr = a*82.81;
		System.out.println("Inr = " +a+", Dollar = "+ inr);
	}
	public void numbers1(double a)
	{
		double dollar = a*0.012;
		System.out.println("Dollar = " +a+", Inr = "+ dollar);
	}
	
	public static void main(String args[])
	{
		Currency_conversion obj = new Currency_conversion ();
							obj.numbers(50);
							obj.numbers1(100);
							obj.numbers1(859);
							obj.numbers1(245);
							obj.numbers(5000);
	}
}
