package Test_qstn;

public class Test_qstn 
{
 public static void main(String args[])
 {
	 Test_qstn obj=new Test_qstn();
	 	obj.numbers();
	 	obj.pattern();
	 	obj.rev_number();
	 
 }
   public void numbers()
   {
	   int sum1=0;
	   int sum2=0;
	   int count=0;
	   int n= 149327;
	   while(n>0)
	   {
		   int a=n%10;
		   count++;
		   if(count%2==0)
		   {
			  sum1=sum1+a;
		   }
		   else
		   {
			  sum2=sum2+a;
		   }
		   n = n/10;
	   }
	   System.out.println(sum1 +"=adding the odd number");
	   System.out.println(sum2+ "=adding the even number");
	   int sub=sum1-sum2;
	   System.out.println(sub+"=Total");
	   System.out.println("////////////////////////////////");
   }
   
   public void pattern()
   {
	   for(char row ='a'; row <='d';row++)
	   {
		   for( int column=1;column<=4;column++)
		   {
			   System.out.print(row+" ");
	   }
	   System.out.println( );
   }
	   System.out.println("////////////////////////////////////");
}

   
   public void rev_number()
       {
	   int rnum=0;
	   for(int n=149327; n>0; n=n/10)
	   {
		   int a=n%10;
		   rnum =rnum*10+a;
	   }
       
   System.out.println( "149327 is a given number"+ " The reverse number is = "+ rnum);
   int prime=rnum;
   int count=0;
   for( int i=1; i<=prime; i++)
   {
	   if (prime%1==0)
	   {
		   count++;
	   }
   }
   if (count==2)
   {
	   System.out.println(prime+ " The given numeber is a prime");
   }
   else
   {
	   System.out.println( prime + "The given number is not a prime");
   }
   System.out.println("/////////////////////////////////////////////");
}
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
