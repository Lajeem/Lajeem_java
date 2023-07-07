package String;

public class Tdy_14_6 
{
	public static void main(String[] args) 
	{
		
	String  s= "this is payilagam ,it is in valechery";
	
	 char[] s1=s.toCharArray();
	 
	 int count=0;
	 char l= 't';
	 
	  for(int i=0;i<s.length();i++)
	  {
		 
		 if(l==s1[i])
		 {
			 count++;	 
		 }
	  }
	  
	  System.out.println(count); 
}
}
