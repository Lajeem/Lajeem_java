package Array;

import java.util.Scanner;

public class Second_max_min_num
{
	public static void main(String []args)
	{
		Second_max_min_num obj=new Second_max_min_num ();
					obj.number();
	}
		void number() 
		{
			int arr[]= {123,12,13,100};
				
			int max= Integer.MIN_VALUE;
			int s_max= Integer.MIN_VALUE;

			for(int index=0;index<arr.length;index++) 
			{
				if(max<arr[index])
				{
					s_max=max;
					max=arr[index];
				}
					if(s_max<arr[index] && arr[index]!=max)
					{
						s_max = arr[index];
					}
			}
		    	System.out.println("First maximum value of Given value ="+ max);
				System.out.println("Given value of second max value = "+ s_max);	
		}
}







