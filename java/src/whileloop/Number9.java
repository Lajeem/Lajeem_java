package whileloop;

class Number9
{
    public static void main(String args[])
    {
       Number9 obj=new Number9();
              obj.sum();
    }
        public void sum()
        {
         int n=721;
         int num=0;
         int count=0;
         while(n>0)
         {
         count++;
         n = n/10;
         System.out.println(count);
         }
         }
}   
