package String;

public class find_repeated_elements 
{
	public static void main(String args[])
		{
		// find the repeative element from the given string
		 
	String s= " i am learning the java";
	 boolean flag =false;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)== s.charAt(j) && s.charAt(i)!=' ')  // after the AND operator the codition with elimnate the  
			{													//space from the console					
				System.out.println(s.charAt(i));
				flag=true;
				break;
			}
		}
		if(flag)
		{
			break;
		}
	}
	
	// using the count variable for these program
	System.out.println("count variable using ");
	
	String s1= "i am learning the java";
	int count =0;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)== s.charAt(j) && s.charAt(i)!=' ')  // after the AND operator the codition with elimnate the  
			{													//space from the console					
				System.out.println(s.charAt(i));
				count++;
				break;
			}
		}
		if(count==1)
		{
			break;
		}
		
		/*
		 * else { System.out.println(""); }
		 */
		 	}
	}
}
	
	
	
	
		
		
		
		
		
		
		
		
		
		

