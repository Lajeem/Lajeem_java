package Realtime;

public class Kilo_mtr_kilo 
{
	public void number(double a)
	{
		double kilometer=a*1000;
		System.out.println("kilometer = "+a+" meter = "+ kilometer );
	}

	public void number1(double a)
	{
		double meter=a/1000;
		System.out.println("meter = "+a+" kilometer = "+ meter );
	}
	public static void main(String args[])
	{
		 Kilo_mtr_kilo obj=new  Kilo_mtr_kilo ();
		 obj.number(3.5);
		 obj.number1(400.26);
		 obj.number1(400);
		 obj.number(700.15);
	}
}
	

