package Forloop;

public class Double_for 
{
	public static void main(String[] args) 
	{
		Double_for obj=new Double_for ();
		obj.number();	
		obj.number1();
		obj.number2();
		obj.number3();
	}

	
/*
 *   1
 *   12
 *   123
 */
void number()
{
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
}
/*
 * 1
 * 22
 * 333
 */
void number1()
{
for(int i=1;i<=3;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(i);
	}
	System.out.println();
}
}

/* 3
 * 32
 * 321
 */
void number2()
{
	for(int i=3;i>=1;i--)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
		
	}
}

/*
 * 3 
 * 22
 * 111
 */ void number3()
 {
	 for(int i=3;i>=1;i--)
	 {
		 for(int j=3;j>=i;j--)
		 {
			 System.out.print(i);
		 }
		 System.out.println();
	 }
 }
}













