package Workout;

public class Add 
{
	public static void main(String args[])
		{
		Add obj=new Add ();
		obj.number();
		}
	void number()
{
	int sum=0;
	int a[]= {1,10,5,4};
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];	
	}
	System.out.println(sum);		
}
}
