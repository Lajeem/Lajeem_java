package Array;

public class Sorting 
{
	public static void main(String args[])
	{
	Sorting obj=new Sorting ();
			 obj.number();
			 obj.number1();
	}
	void number()
	 {
		int a[]= {3,0,1,2,5,7}; // ascending order by sorting
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}	
		}		
		System.out.println("Accending order of the given array values");
		for(int i =0;i< a.length;i++)
		{
			System.out.println(a[i]);			
		}
		System.out.println();
	 }
	
	void number1()
	 {
		int a[]= {3,0,1,2,5,7}; // descending order by sorting
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}	
		}		
		System.out.println("Decending order of the given values");
		for(int i =0;i< a.length;i++)
		{
			System.out.println(a[i]);
		}
	 }
}
	
	
	
	
	
	
	
	
	
	
	

