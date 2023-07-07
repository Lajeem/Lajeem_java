package Forloop;

public class Lcm 
{
	public static void main(String args[])
	{
		Lcm obj=new Lcm();
			obj.numbers(3, 6);
	}
		public void numbers(int a,int b)
		{
			int range=a*b;
	        int large =(a>b) ? a:b;  // ternary operator
	        for(;large<=range;large++)
	        {
	        if(large%a ==0 && large%b ==0)
	        {
	        System.out.println("least number="+large);
	        break;
	        }
	        }
	     }
}

