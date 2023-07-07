 package Array;
import java.util.Scanner;
public class Array 
{
	public static void main(String[] args) 
	{
		Array obj = new Array();
		obj.number();
	}

	void number() 
	{
	int height[]=new int[5];
		
		  height[0]=7; 
		  height[1]=8;
		  height[2]=9; 
		  height[3]=3;
		  height[4]=8;
		  
		  System.out.println(height[0]);
		  System.out.println(height[1]);
		  System.out.println(height[2]); 
		  System.out.println(height[3]);
		  System.out.println(height[4]);
		  System.out.println("-----------------");
		 
	// using for loop
		 
		for(int i=0;i<height.length;i++) 
		{ 
			System.out.println(height[i]);
		} 
		
	}
}

