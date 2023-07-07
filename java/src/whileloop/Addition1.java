package whileloop;

class Addition1
{
public static void main(String args[])
{
   Addition1 obj=new Addition1();
            obj.add();
}
public void add()
{
    int a=5;
    int b=5;
    int sum=a+b;
    int product=a*b;
    if (sum%2==0||product%3==0)
    System.out.println("hello");
}
}
