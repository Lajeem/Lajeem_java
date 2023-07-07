package String;
import java.util.Scanner;
public class Char_from_scanner 
{
public static void main(String args[])
		{
			Scanner sc= new Scanner(System .in);
			
			 System.out.println("Enter the String element");
			 String s1=sc.nextLine();
			 
			 System.out.println("Enter the search element");
			 
			 char d=sc.nextLine().charAt(0);
			 int count=0;
			 
			 for(int i=0;i<s1.length();i++)
			 {
				 	 
				 if(s1.charAt(i)==d)
				 {
					 count++;
				 }
			 }
			 System.out.println(count);
		}
}

		
		 
			 
		
		 
	 
	
		



