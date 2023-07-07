package Array;

public class Find_large_small_value 
{
	public static void main(String[] args) 
	{
		Find_large_small_value obj=new Find_large_small_value ();
								obj.number();
								obj.number1();
}	
	 void number()
	{
		int arr[]= {7,8,10,5,4,2};
		
		int large=arr[0];//or//int max=Integer.MIN_VALUE;
		for( int index=0;index<arr.length;index++)
		{
			if(large<arr[index])
			{
				large=arr[index];
			}
		}
		System.out.println("Given large value is ="+large);
	}
	void number1()
	{
		int arr[]= {5,6,8,5,4,9};
		
		int small=Integer.MAX_VALUE;// or//int small=arr[0];
		for(int index=0;index<arr.length;index++)
		{
			if(small>arr[index])
			{
				small=arr[index];
			}
		}
		System.out.println("Given small value is ="+small);
	}
}
		
			
		
		
		