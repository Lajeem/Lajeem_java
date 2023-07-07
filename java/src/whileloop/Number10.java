package whileloop;

class Number10
{
    public static void main(String args[])
    {
       Number10 obj=new Number10();
              obj.sum();
    }
        public void sum()
        {
        int n=123;
        int r_num=0;
        while(n>0)
        {
        int a=n%10;
        r_num=r_num * 10+a;
        n=n/10;
        }
        System.out.println(r_num);
        }
}
       
