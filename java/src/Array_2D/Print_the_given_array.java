package Array_2D;

public class Print_the_given_array //Print the given element in  2d array in matrix form
{
	public static void  main(String args[]) 
	{
		Print_the_given_array obj=new Print_the_given_array ();
			   				  obj.number();		
	}
	void number()
	{
		int a[][]= {{1,2,3,4,5},{7,8,4,5,6},{4,5,7,8,9},{9,6,5,2,3},{2,5,8,7,9}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=a[i][j];
			}
		}
		
		// display the elements so use for loop to show
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
			System.out.println();
		}	
	}
}
