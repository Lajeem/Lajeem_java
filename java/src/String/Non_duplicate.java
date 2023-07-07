package String;

import java.util.Scanner;

public class Non_duplicate 
{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	
	 String ls []=new String[5];
	 
	 System.out.println("Enter the elements");
	 
	 for(int i=0; i<5; i++)
	 {
		 String s =sc.next();
		 
		 for(int j=0;j<1;j++)
		 {
			if(ls[j]!=s) 
			{
				ls[i]=s;
			}
		 }
	 }
	 for(String s:ls) 
	 {
		 System.out.println(s);
	 }
}
}
