package Workout;

public class Max_value 
{
	public static void main(String args[])
	{
		Max_value obj=new Max_value ();
		obj.max_sec_max();
    }
void max_sec_max()
{
	int a[]= {1,8,7,9};
	int max=0;
	int s_max=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		
	}
	System.out.println("max = " +max);
	
}
}











