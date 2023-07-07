package whileloop;

public class Neon 
{
public static void main(String args[])
{
	int a=9;
	int sum=0;
	int sqr=a*a;
	
	while(sqr>0)
	{
		int b=sqr%10;
		sum=sum+b;
		sqr=sqr/10;
	}
	if(sum==a)
	{
		System.out.println("neon");
	}
	else
	{
		System.out.println("not");
	}
	System.out.println(sum);
	
}
}
