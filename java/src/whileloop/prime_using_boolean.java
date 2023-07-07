package whileloop;

public class prime_using_boolean 
{
	public static void main(String args[])
	{
	prime_using_boolean obj=new prime_using_boolean();
						obj.numbers();
	}
	public void  numbers()
	{
		boolean flag =false;
		int n=64;
		int i=2;
		while(i<n/2)
		{
			if (n%i==0)
			{
				flag=false;
				break;
			}
			i++;
			if (flag=true)
			{
				System.out.print("It is not a prime number");
			}
			else
			{
				System.out.print("It is prime number");
			}
			System.out.println();
		}
	
	}
}
	