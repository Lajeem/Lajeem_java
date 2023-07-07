package Array;
import java.util.Scanner;
public class Array_min_max_index_value 
{
	public static void main(String[] args)
	{
		Array_min_max_index_value obj=new Array_min_max_index_value();
					  obj.number();
	}
	void number()
	{
		//int arr[]= {5,2,4,7,8,9};
		
		  Scanner s =new Scanner(System.in);
		  
		  System.out.println("Enter the size");
		  int size=s.nextInt(); 
		  int arr[]=new int[size];
		 
		 System.out.println("Enter the element");
		 	for(int index=0;index<arr.length;index++)
		{
			arr[index]=s.nextInt();
		}
		System.out.println();
		System.out.println("first element = "+arr[0]);	
		System.out.println("last element = "+arr[arr.length-1]);
		}
}

	