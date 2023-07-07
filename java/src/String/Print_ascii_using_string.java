package String;

public class Print_ascii_using_string 
{ 
	public static void main(String[] args) 
	{
		Print_ascii_using_string obj=new Print_ascii_using_string ();
					 		     obj.Capital();
					 		     obj.Smaller();
					 		     obj.number();  
	}
	
	public void Capital()
	     {
		String s ="abcdefghijklmnopqrstuvwxyz";	//change the smaller case into upper and thn it convert into upper ascii value
		
		String upper=s.toUpperCase();
		 System.out.println(upper);
		 System.out.println();
		 
		for(int i=0;i<s.length();i++)
			{
				char a =upper.charAt(i);
				System.out.println( "'"+a+"'" +"of ASCII value is = "+(int)a);
			}
		System.out.println();
	     }
	
	public void Smaller()
	{
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  ////change the upper case into lower and thn it convert into lower ascii value

		
		String lower=s.toLowerCase();
		System.out.println(lower);
		System.out.println();

		for( int i=0;i<s.length();i++)
		 {
			 
			 char b = lower.charAt(i);
			 System.out.println( "'"+b+"'" +" of ASCII value is = "+(int )b);
			 
		 }
		System.out.println();
	}
	
	
	public void number()		
	{
		
		String n="0123456789";						// charAt(i)- it does  seperate the letter from "n" 
		System.out.println("Numbers");				// thn placed into char "s"
		for( int i=0;i<n.length();i++)				//(int)s - it change the "int" into "Ascii" 
		{
			char s=n.charAt(i);					
			System.out.println( "'"+s+"'" +" of ASCII value is = "+ (int)s);
		}
		
		
		
		
		
		
		
		
		

	}
	
}
