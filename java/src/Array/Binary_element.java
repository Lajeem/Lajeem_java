package Array;

public class Binary_element 
{
public static void main(String args[])
		{
	Binary_element obj=new Binary_element ();
				   obj.number();
		}
void number()
{
	int a[]= {5,4,1,3,2,-5,-3,9,12,0,1,15};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int find=9;
		
		 int m=(a.length +1)/2;
		 
		 int l=0; int  h=a.length;
		 
	}
 }

