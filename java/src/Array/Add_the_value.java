package Array;

public class Add_the_value 
{
	public static void main(String[] args) 
	{
	Add_the_value obj =new Add_the_value ();
				  obj.number();
	}
	 void number()
	 	{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};          // expected output = 6 8 10 12 
		int c[]=new int [a.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
}
}


