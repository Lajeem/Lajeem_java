package Test_qstn;

public class Class_test_30_5_23 
{
	public static void main(String arge[])
	{
	Class_test_30_5_23 obj =new Class_test_30_5_23 ();
	obj.number();
	obj.subset();
	obj.method();
	obj.reverse();
	obj.odd_even();
	}
void number()
{
	for ( int i=1;i<=5;i++)
	{
		for( int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||j==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}


void subset()
 {
	 int a[]= {5,4,1,7,2};
	 int b[]= {5,4,2};
	 int count =0;
	 for(int i=0;i<a.length;i++) 
	 {
		 for(int j=0;j<b.length;j++)
		 {
			 if(a[i]==b[j])
			 {
				 count++;
				 break;
			 }
		 }
	}
	 if(count==b.length)
	 {
		 System.out.println("B is a subset of A"); 
	 }
	 else
	 {
		 System.out.println("B is not subset of A" );
	 }
 }
 
 // print the 7th table 7*1=7 to 7*10=70
 void method() 
 {
	 int n=7;
	for(int i=1;i<=10;i++)
	{
		System.out.println(n+"*"+i+"="+i*n);
	}	 
 }
 
 // reverse the number
  void reverse()
  {
	  int a[]= {3,1,7,5,2};
	  
	  for(int i=a.length-1;i>=0;i--)
	  {
		 System.out.println(a[i]); 
	  }
  }

void odd_even()
{

	int num=7321; 
	int sum1=0;
	int sum2=0;
	int n=num;
	int number=n;
	int count=0;
	int ans=0;
	
	for(int i=0;i<number;number=number/10)
	{
		count++;
	}
	
	for(int i=0;number>i;num=num/10)
	{
		int a=num%10;
		
		if(count%2==0)
		{
			sum2= sum2+a;
		}
		else
		{
			sum1=sum1+a;
		}
		count--;
	}
	 ans=sum1-sum2;
	
	System.out.println("sum1"+sum1);
	System.out.println("sum2"+sum2);
	System.out.println("ans"+ans);
}
}

	


	
	
	




























