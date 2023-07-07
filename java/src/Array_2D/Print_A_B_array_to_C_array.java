package Array_2D;

public class Print_A_B_array_to_C_array 
{
	public static void main(String args[])
	{
		Print_A_B_array_to_C_array obj=new Print_A_B_array_to_C_array ();
		          				   obj.sum_the_two_array_into_one();
	}
	void sum_the_two_array_into_one() // Sum the given 2  (A) (B) array  and then it store in another one array (c)
	{
		int a[][]= {{1,2,3,4,5},{6,7,8,9,9},{8,7,6,5,4},{3,2,1,1,2},{3,4,5,6,7}};
		int b[][]= {{1,2,3,4,5},{6,7,8,9,9},{8,7,6,5,4},{3,2,1,1,2},{3,4,5,6,7}};
		
		int c[][]=new int [a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of the two array");
		// display
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	
	
		// Difference the given two array elements 
		
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
		}
	}
	System.out.println("Difference the 2 array");
	//display
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}

	//Product the given two array elemnts
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			c[i][j]=a[i][j]*b[i][j];
		}
	}
	System.out.println("Product the 2 array");
	// display
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
	
	
	
	
	
	
	
	
	

