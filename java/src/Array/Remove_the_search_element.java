package Array;

public class Remove_the_search_element 
{
public static void main(String[] args) 
{
	Remove_the_search_element obj=new Remove_the_search_element ();
							  obj.number();
}
void number()
{
	int a[]= {15,17,19,25,1,2,3};
	 
	int b[]=new int[a.length-1];
	
	int search=19;
	int temp=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(search != a[i])
		{
			b[temp]=a[i];
			temp++;
		}
	}
	System.out.println("After remove the elements");
	for(int i=0;i<b.length;i++)
	{	
		System.out.println(b[i]);
	}	 
}
}





