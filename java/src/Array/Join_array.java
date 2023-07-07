package Array;

public class Join_array 
{
public static void main(String[] args) 
{
	Join_array obj=new Join_array ();
			   obj.number();
			   obj.number1();
}
void number()
{
	int arr[]= {7,5,9,2,3,11};
	int arr1[]= {3,5,9,1};
	
	 int result[]=new int[arr.length+arr1.length];
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 result[i]=arr[i];
	 }
	 for(int i=0;i<arr1.length;i++)
	 {
		 result[i+arr.length]=arr1[i];
		
	 }
	 for(int i=0;i<result.length;i++)
	 {
	 System.out.print(result[i]);
	 }
}


void number1()
{
		int a[]= {7,3,5,1,9};
		int b[]= {3,4,8};
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
			 if (a[i]==b[j])
		      {
				 count++;
		      }
			 }	
		}
		System.out.println(count);
		System.out.println();
		
		int c[]=new int[(a.length+b.length)-count];
		 
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println (c[i]);
		}
		
		int temp=a.length;
		System.out.println("after merging array");
		for(int i=0;i<b.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=true;
				}
			}
			
			if(flag==false)
			{
				c[temp]=b[i];
				temp++;
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);	
		}		
}	
}
		
		

















