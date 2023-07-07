package Workout;

public class Practice 
{
	public static void main(String args[])
	{
		Practice obj=new Practice ();
		obj.print_array();
		obj.sum_avg_rev();
		obj.odd_even();
		obj.search();
		obj.repeative();
		obj.replace_element();
		obj.max_min_index();
		obj.sorting();
		obj.print();
		obj.add_the_2_array();
	}
	
	void print_array()
	{
		int a[]= {1,2,3,4,7,8,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[]="+a[i]);
		}
		System.out.print("///////////");
	}
	
	
	void sum_avg_rev()
	{
		int a[]= {1,4,5,6,8,7};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum = "+sum);
		
		/////////////////////////////////
		int avg=0;
		for(int i=0;i<a.length;i++)	
		{
			 avg=sum/a.length;
		}
		System.out.println("Average = "+avg);	
	
		///////////////////////////////////
		int rev=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("Reverse the a[]= "+a[i]);
		}
    }
	
	////////////////////////////
	void odd_even()
	{
		int a[]= {8,7,9,10,12,4};
		int odd=0;
		int even=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.println("odd = "+a[i]);
				odd=odd+a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println("Even = "+a[i]);
				even=even+a[i];
			}
		}
		
		 int diff= even-odd;
		 System.out.println("diff = "+diff);
	
	}
	
	/////////////////////////////////////////////////
	void search()
	{
		int a[]= {7,8,9,5,6,4,2};
		int search=5;
		
		boolean flag =false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("Search value is present in the array ");
				flag=true;				
			}
			else if(flag=false)
			{
				System.out.println("Search value is  not present in the array ");
			}	
		}
	}
		
	//////////////////////////////////////////////////
		void repeative()
		{
			int a[]= {8,5,7,9,6,3,5};
			int count=0;
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					//	System.out.println("Repeative elemnts = "+a[i]); if we put the sop in this line  
					}									//if we cant put the reapative elements that cant 
															//	be shown so put the if else condition.
				}
			}
			
			if(count>0)
			{
				System.out.println("Repeative element is present");
			}
			 else 
			 {
				 System.out.println("Repeative element is not present");
			 }
}
		
	///////////////////////////////////////////	
		
		void replace_element()
		{
			int a[]= {1,5,6,8,6,4,6};
			int rep=6;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==rep)
				{
					a[i]=-5;
				}
				System.out.println(a[i]);
			}
		}
		/////////////////////////////////////////
		
		void max_min_index()
		{
			int a[]= {127,54,300,89,200};
			
			for(int i=0;i<a.length;i++)
			{
				
			}
			System.out.println("Minimum index = "+a[0]);
			System.out.println("Maximum index = "+a[a.length-1]);	
			
			
	//	find the  second maximum and minimum 
			int max= Integer.MIN_VALUE;
			int Smax=Integer.MIN_VALUE;
					
			for(int i=0;i<a.length;i++)
			{
				if(max<a[i])
				{
					Smax=max;
					max=a[i];
				}
					if(Smax<a[i] && a[i]!=max)
					{
						Smax = a[i];
					}
			}
		    	System.out.println("First maximum value of Given value ="+ max);
				System.out.println("Given value of second max value = "+ Smax);	
		}
				
				
		void sorting()
		{
			int a[]= {5,7,8,9,5,2,4};
			int temp=0;
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Sorting in ascending order ="+a[i]);
		    }
			
			System.out.println("//////////////////////");
			for(int i=0;i<a.length;i++)// descending order
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Sorting in decending order ="+a[i]);
		    }
		}
		///////////////////////////////////////////
			
		void print()
		{
			int a[]= {7,8,5,2};
			int temp=0;
			
			int b[]=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
				b[temp]=a[i];
				temp++;		
			}
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}	
		}
		
		///////////////////////////////////////////
		void add_the_2_array()
		{
			int a[]= {1,2,3,4,5};
			int b[]= {6,7,8,9,10};
			
			int c[]=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i]+b[i];
				System.out.println("A and B array="+c[i]);
			}	
		}
			
			
			
			
			
			
			
			
			
			
			
			
		
		

		
	
		
	
	
}












