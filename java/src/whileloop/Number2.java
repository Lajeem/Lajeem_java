package whileloop;

class Number2
{
    public static void main(String args[])
    {
       Number2 obj=new Number2();
              obj.sum();
    }
        public void sum()
        {
        int n=7;
        int b=1;
        int r_num=0;
        while(n>=1)
        {
        int a=n%10;
        r_num=r_num*10+a;
        n=n/10;
        n=n-1;
        }
        System.out.println(r_num);
        }
}
        
