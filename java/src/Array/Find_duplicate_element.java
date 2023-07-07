package Array;

public class Find_duplicate_element {
	
	public static void main(String args[])
	{
		Find_duplicate_element obj = new Find_duplicate_element();
		                       obj.number();
	}

	public void number()
		{
			int arr[] = {5,2,3,5,4,6,7};
	        
			//int count=0;
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
					System.out.println("The duplicate value is = "+arr[i]);	
					}
				}
			}
			
			/*
			 * if(count==0) { System.out.println("NO Duplicate present in the array"); }
			 * else { System.out.println("Dupliacte present in the array"); }
			 */		}
}
