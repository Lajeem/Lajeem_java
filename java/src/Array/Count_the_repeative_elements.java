package Array;

import java.util.Scanner;

public class Count_the_repeative_elements 
{
	public static void main (String [] args)
	{
		Count_the_repeative_elements obj=new Count_the_repeative_elements();
				obj.number();
	}
	void number()
	{
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int index=0;index<arr.length;index++)
		{
			arr[index]=s.nextInt();
        }
		System.out.println("Search the index value");
		int search_index=s.nextInt();
		for(int index=0;index<arr.length;index++)
		{
		if(search_index==arr[index]) // count the repeative elemnts
		{
			count++;
		}
	}
		if(count>0)
		{
			System.out.println("The given value is in ="+ count+" times");
		}
		else
		{
			System.out.println("It is not in array");
		}
}
}
