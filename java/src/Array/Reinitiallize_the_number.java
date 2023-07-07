package Array;

public class Reinitiallize_the_number 
{
	public static void main(String args[])
	{
		Reinitiallize_the_number obj=new Reinitiallize_the_number ();
		                         obj.number();
	}

    void number() 
    {
	int arr[]= {1,3,5,1,2,1,7,9,1};  // change the 1 into -1 
	
	int re=-1;
	for(int index=0;index<arr.length;index++)
	{
			if(arr[index]==1)
			{
				arr[index]=re;
			}
			System.out.println(arr[index]);
		}
	}
	
}
