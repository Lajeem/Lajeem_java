package Forloop;

public class Reverse_number 
{
	public static void main(String args[])
	{
		Reverse_number obj=new Reverse_number();
					obj.numbers(123);
					obj.numbers(547);
	}
	public void numbers(int n)
	{
		int rev=0;
		for(int i=0;i<n;n=n/10)
		{
		int a=n%10;
		rev=(rev*10)+a;
		}
	System.out.println(rev);
	}
}
