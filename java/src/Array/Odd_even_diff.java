package Array;
import java.util.Scanner;
public class Odd_even_diff 
{
	public static void main(String[] args) 
	{
		number();
	}
 static	void number()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int num[]=new int[size];
		
		System.out.println("Enter the elements of array");
		
		for(int index=0;index<num.length;index++)
		{
			num[index]=sc.nextInt();
		}
		System.out.println();
		
		//find the even number of given value
		int Even=0;
		for(int index=0;index<num.length;index++)
		{
			if (num[index]%2==0)
			{
				System.out.println("The given even numbers" + num[index]);
			//	Even=Even+num[index];
			}
		}
		System.out.println();
		
		//find the odd numbers of the given value
		int Odd=0;									
		for(int index=0;index<num.length;index++)
		{
			if (num[index]%2!=0)
			{
				System.out.println("The given odd number"+ num[index]);
				//Odd=Odd+num[index];
			}
		}
		System.out.println();
		
		// sum of the odd and even values
		//int Sum=0;
		int Sum=Odd+Even;
		System.out.println("Sum of the odd and even values"+ Sum);
		
		//Difference  btwn the odd and even values
		int Diff=0;
		Diff=Odd-Even;
		System.out.println("Diffenece the odd and even values"+ Diff);
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
