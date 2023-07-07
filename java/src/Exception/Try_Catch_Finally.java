package Exception;

import java.util.Scanner;

public class Try_Catch_Finally 
{
 public static void main(String args[])
 {
	 Try_Catch_Finally obj=new Try_Catch_Finally ();
	 obj.method();
 }
 
 void method()
 {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the a number");	 
	 int first =sc.nextInt();
	 
	 System.out.println("Enter the b number");
	 int second =sc.nextInt();
	 
	 obj add(first,second);
	 obj divide(first,second);
	 obj multi(first,second);
	 
 }

private void add(int first, int second) 
{
	System.out.println(first+second);	
}

private void divide(int first, int second) 
{
	System.out.println(first/second);	
}
private void multi(int first, int second) 
{
	System.out.println(first*second);
}

 }



