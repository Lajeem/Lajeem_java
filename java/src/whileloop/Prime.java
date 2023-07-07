package whileloop;

class Prime
{
    public static void main(String args[])
    {
      Prime obj=new Prime();
            obj.number(56);
            obj.number(73);
            obj.number(29);
            obj.number(107);
    }
         public void number(int num)
         {
         int i=1;
         int count=0;
         while(num>=i)
           {
             if(num%i==0)
               {
                count++;
               }
                i++;
           }
             if( count==2)
                {
                 System.out.println("given number is the prime number = "+num);
                }
             else
                {
                 System.out.println("given number is not a prime number = "+num);
                }
            }

         
         
         
   public static void main(String args[])
   {
	   Prime obj=new Prime();
	         obj.numbers();
   }
   public void numbers()
   {
	   int count=0;
	   int prime=2;
	   while(count<15)
	   {
		   int div =0;
		   int i=1;
		   while(i<=prime)
		   {
			   if (prime%i==0)
			   {
				   div++; 
			   }
			   i++;
  		   }
		   if ( div==2)
		   {
			   System.out.print(prime);
			   count++;
		   }
		   prime++;
		   
	   }
   }
}
         
         
         
         
         
         
         
         
         
         
         
         
         
