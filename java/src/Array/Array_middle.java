package Array;
import java.util.Scanner;
public class Array_middle 
{
public static void main(String[] args) 
	{
	Array_middle obj=new Array_middle();
				 obj.number();
	}
	void number()
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the size");
	int size=s.nextInt();
	int arr[]= new int[size];
	
	System.out.println("Enter the elements");
	for(int index=0;index<arr.length;index++)
	{
		arr[index]=s.nextInt();
	}
	System.out.println("Find the middle value of the index");
	
		if(arr.length%2!=0)						
		{
			int mid=arr.length/2;
			System.out.println("Odd Mid value = "+arr[mid]);
		}
		  if(arr.length%2==0)				
		  {
			  int mid=arr.length/2;
		      System.out.println("Even mid value ="+arr[mid]);
		      System.out.println("Even mid value ="+arr[mid-1]);
		  }
		}
}

		 
	
	
			
	
	
	
	

