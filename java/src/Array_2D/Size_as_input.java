package Array_2D;

public class Size_as_input
{
	public static void main(String args[])
	{
		Size_as_input obj=new Size_as_input();
		       obj.number();		
	}

	void number() // declare the size of the array as input and print
	{
		int arr[][]= new int[3][4];
		
		int a=1;
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=a;
				a++;
			}
		}
		for(int row=0;row<arr.length;row++)  // display for loop
		{
			for(int col=0;col<arr[row].length;col++)
			{
			System.out.print(arr[row][col]+" ");
			}
			
			System.out.println();
        }
	}
}
