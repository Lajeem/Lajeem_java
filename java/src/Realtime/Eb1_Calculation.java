package Realtime;

public class Eb1_Calculation 
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
			while(500<1000) 										//1-100=0 	
			{													    //101-400 =4.50
			if (unit<=100)											//401-500=6.00
			{														//501-600=8.00
				System.out.println("Free");							//601-800=9.00
			}														//801-1000=10.00
			if (unit>=101 && unit <=400)							//1000=11.00
			{
				System.out.println("101-400 = "+(unit-100)*4.50);
			}
			if (unit>=401 && unit <=500)
			{
				System.out.println("401-500 = "+(400-101)*4.50 + (unit-400)*6);	
			}
			if(unit>=501 && unit <=600)
			{
				System.out.println("501-600 = "+(400-100)*4.50 + (500-400)*6+ (unit-500)*8);
			}
			if(unit>=601 && unit <=800)
			{
				System.out.println("601-800 = "+(400-100)*4.50+(500-400)*6+(600-500)*8+(unit-600)*9);
			}
			if(unit>=801 && unit <=1000)
			{
				System.out.println("801-1000 = "+(400-100)*4.50+(500-400)*6+(600-500)*8+(800-600)*9 +(unit-800)*10);
			}
			//if(unit>=1000)
			//{
			//	System.out.println("The given unit is above 1000 = "+(400-100)*4.50+(500-400)*6+(600-500)*8+(800-600)*9 +(1000-800)*10+(unit-1000)*11);
			//}
			break;
		}
	}
	            public static void main(String args[])
	             {
	            	Eb1_Calculation obj =new Eb1_Calculation();
								 obj.numbers(50);
								 obj.numbers(155);
								 obj.numbers(200);
								 obj.numbers(489);
								 obj.numbers(500);
								 obj.numbers(450);
								 obj.numbers(600);
								 obj.numbers(850);
								 obj.numbers(545);
								 obj.numbers(125); 
								 obj.numbers(1000); 
								// obj.numbers(1500);
								
	           	}
}


