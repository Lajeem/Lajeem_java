package Array_2D;
import java.util.Scanner;

public class Declare_array_from_scanner 
{
	public static void main(String args[])
	{
		Declare_array_from_scanner obj=new Declare_array_from_scanner ();
								   obj.number();
	}
	
	void number()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  row size of the array");
		int size1=s.nextInt();
		
		System.out.println("Enter the  column size of the array");
		int size2=s.nextInt();
		
		int a[][]=new int[size1][size2];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		//Display 
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
