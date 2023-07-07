package Array;
import java.util.Scanner;
public class Scanner_class 
{
	public static void main(String[] args)
	{
		Scanner_class obj=new Scanner_class();
		  obj.number();
	}
	public static void number()
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
	}
}
		
		
