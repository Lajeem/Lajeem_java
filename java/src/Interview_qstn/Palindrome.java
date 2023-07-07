package Interview_qstn;

public class Palindrome 
{
	public void number()
	{
	int a =121;
	int c = a;
	int rnum=0;
	while(a>0)
	{
		int b=a%10;
		rnum=rnum*10+b;
		a=a/10;
	}
	if(rnum==c)
	{
		System.out.println(" 121 = The given number is palindrome");
	}
	else
	{
		System.out.println("121 = The given number is not a palindrome");
	}

}
	public static void main(String args[])
	{
		Palindrome obj = new Palindrome();
		obj.number();
	}
}