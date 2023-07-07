package Array;

import java.util.Scanner;

public class Adjacent_side 
{
	public static void main (String args[])
	{
	Adjacent_side obj=new Adjacent_side ();
	obj.number();
}
	void number()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the index");
		int size= s.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the elements");
		for(int index=0;index<arr.length;index++)
		{
			arr[index]=s.nextInt();
		}
		System.out.println("Enter the find value");
		int find=s.nextInt();
		System.out.println("Next and pervious elements");
		for(int j=0;j<arr.length;j++)
		{
			if(find==arr[j])
			{
				if(j!=0 && j!=arr.length-1)
				{
					System.out.println(arr[j-1]);
					System.out.println(arr[j+1]);
				}
			
				else if  (find== arr[0])
					{
						System.out.println(arr[j+1]);
					}
					else if (find== arr[arr.length-1])
						{
							System.out.println(arr[j-1]);
						}
			}
		}
	}
}

