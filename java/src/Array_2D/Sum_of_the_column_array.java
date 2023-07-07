package Array_2D;

public class Sum_of_the_column_array 
{
	public static void main(String args[])
	{
		Sum_of_the_column_array obj=new Sum_of_the_column_array ();
								obj.number();
	}
	void number()
	{
		int a[][]= {{1,2,3,4,5},{7,8,4,5,6},{4,5,7,8,9},{9,6,5,2,3},{2,5,8,7,9}};
		
		System.out.println("sum of the array column ");
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum=sum+a[j][i];
			}		
			System.out.println(sum);
		}
	}
}
