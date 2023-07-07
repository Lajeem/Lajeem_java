package Forloop;

public class Range 
{
	public static void main(String args[])
	{
		Range obj=new Range();
			  obj.numbers();
			  obj.reversed();
			  obj.dual_number();
		
	}
		public void numbers()
		{
			for(int i=200;i<300;i++)
			{
				if(i%2 ==0)
				{
			System.out.println(i);
			}
	     }
			System.out.println("--------");
	 }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// div by 9 range btwn 200-150 in reversed model
		
		public void reversed()
		{
			for(int i=200; i>150;i--)
			{
				if (i%9==0)
				
					System.out.println(i);
				}
			System.out.println("--------------");
			}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// div by 3 and 5 which is from 1-100
		
		public void dual_number()
		{
			for(int i=1;i<100;i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println(i);
				}
				
			}
			
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		