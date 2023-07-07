package Array;

public class Back_up 
{
	public static void main(String[] args) 
	{
		Back_up obj=new Back_up ();
				obj.number();
	}
	void number()
	{
		int arr[]= {3,5,8,7,9,10,15};
		int bck[]=arr;
		for(int index=0;index<arr.length;index++)
		{
			bck[index]=arr[index];
			System.out.println("Back up value is ="+arr);
		}
		//System.out.println("Back up value is ="+arr[index]);
	}
}
