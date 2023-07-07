package Forloop;

public class Palindrome 
{
	public static void main(String args[])
	{
	Palindrome obj=new Palindrome();
			   obj.reverse(245);
			   obj.reverse(121);
	}
	public void reverse(int a)
	{
		int n=a;
		
		int r_num=0;
		for(int b=0;n>b;n=n/10)
		{
			int digit = a%10;
			r_num = r_num*10+digit;
		}
		if(r_num==a)
		{
			System.out.println( a +" =The given number is a palindrome");
		}
		else
			{
			System.out.println(a+" The given number is not a palindrome");
			}
		}
	}
