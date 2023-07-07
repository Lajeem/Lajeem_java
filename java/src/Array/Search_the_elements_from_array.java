package Array;

import java.util.Scanner;

public class Search_the_elements_from_array 
{
	public static void main(String []args)
	{
		Search_the_elements_from_array obj=new Search_the_elements_from_array();
			obj.number();
	}
	 void number()
	{ 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size value");
	    int size=s.nextInt();
		boolean flag= false;
		
	    int arr[]=new int[size];
		
		System.out.println("Enter the elements");
			for(int index=0;index<arr.length;index++)
		{
	          arr[index]=s.nextInt();
		}
		
		System.out.println("Search the element");
		
		int search=s.nextInt();
		for(int index=0;index < arr.length;index++)
		{
			if(search==arr[index])
			{
				System.out.println("Search element is present in array ="+ arr[index]);
				flag=true;
			}
		}
			if(flag== false)
			{
				System.out.println("It is not present in the array ");
			}
			s.close();
		}
	}

			
		
		
	 

