package whileloop;

public class Fibonaci
{
		public static void main(String args[])
		{
		Fibonaci obj=new Fibonaci();
		         obj.series();
		}
	    public void series()
	    {
	    int n=10;
		int first=0;
		int second=1;
		int count=1;
		while(count<=10)
		{
			int value=first+second;
			System.out.println(value);
			first=second;
			second=value;
			count++;
		}

	}
}
