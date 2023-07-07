package Array_2D;

public class Sum_of_the_row_array 
{
	public static void main(String args[])
	{
		Sum_of_the_row_array obj=new Sum_of_the_row_array ();
						 obj.number();
						 obj.number1();
	}
	void number() // sum the array in row wise 
	{
		int a[][]= {{1,2,3,1,2},{4,5,6,4,5},{7,8,9,7,8},{7,8,9,4,5},{4,1,2,3,5}};
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];	
			}
			System.out.println((i+1)+" row sum = "+sum);
		}
	}	
	
	
	  void number1() // sum the total array
	  { 
		  int a[][]= {{1,2,3,1,2},{4,5,6,4,5},{7,8,9,7,8},{7,8,9,4,5},{4,1,2,3,5}};
	  
		  int sum=0;
		  for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					sum=sum+a[i][j];
				}		
			}
		  System.out.println();
			System.out.println("Sum of the total elements = "+sum);
	  }
}



