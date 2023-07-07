package whileloop;

class Palindrome
{
    public static void main(String args[])
    {
      Palindrome obj=new Palindrome();
                 obj.number(151);
     }
        public void number(int num)
        {
         int n=num;
         int a=0;
         int r_num = 0;
         while(n>a)
          {
            int b =n%10;            // 151%10 = 1      // 15%10=5    // 1%10 = 1  //false
            r_num=(r_num*10)+b;    // 1               // 15         // 151
            n=n/10;               // 151/10 = 15     // 15/10=1    // 1/10=0  
            
                
          }
                if(r_num==num)
                   {
                    System.out.println(num + " given number is a palindrome");
                    }
                else
                    {
                    System.out.println(num + " given number is not a palindrome");
                    }
           }
}
