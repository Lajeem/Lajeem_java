package whileloop;

import java.util.Scanner;

class Add
{
public static void main (String [] args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter fsrt number");
	int a=obj.nextInt();
	
	Scanner obj1=new Scanner(System.in);
	System.out.println("enter second number");
	int b=obj1.nextInt();
	
	Add obj2=new Add();	
			obj2.add1(a,b);
}

void add1(int a ,int b)
{
	int c=a+b;
	System.out.println (c);
	
}



}
