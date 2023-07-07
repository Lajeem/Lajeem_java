package Realtime;

public class Eb_calculation 
{
  public static void numbers(int unit)
  {
	while(unit<=500)
	{
		if (unit<=100)
		{
			System.out.println("Free");
		}
		if( unit>100 && unit<=200)
		{
			System.out.println((unit-100)*2.25);
		}
		if(unit >201 && unit<=400)
		{
			System.out.println((200-100)*2.25 +(unit-200)*4.50);
		}
		if(unit>401 && unit<=500)
		{
			System.out.println((200-100)*2.25+(400-200)*4.50 +(unit-400)*6.00);
		}
		break;
	}
 }	
            public static void main(String args[])
             {
	          Eb_calculation obj =new Eb_calculation();
							 obj.numbers(50);
							 obj.numbers(155);
							 obj.numbers(200);
							 obj.numbers(489);
							 obj.numbers(500);
							 obj.numbers(450);	
              }
}
