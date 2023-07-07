package String;

public class String_method 
{
	public static void main(String[] args) 
	{
		String_method obj=new String_method ();
		obj.char_into_string();
		obj.convert_into_ascii();
		obj.upperCase_lowerCase();
		obj.trim();
		obj.concadination();
		obj.ASCII_value();

	}
	void char_into_string()
	{
		String s="Payilagam";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println();

	}
	
	
			void convert_into_ascii() // char convert int ascii value
			{
				char c='a';
				int a='c';
				
				System.out.print("char into ascii value = "+ a);
				System.out.println();
				
				int num=200;			// int convert char ascii value
				char n=(char)num;
				
				System.out.println("int into ascii value ="+n);
			}
			
					void upperCase_lowerCase()
					{
						String s="Lajeem";
						
						//upper case
						String upper =s.toUpperCase();
						System.out.println("upper ="+upper);
						
						//lower case
						String lower =s.toLowerCase();
						System.out.println("Lower ="+ lower);
					
				   }
					
						void trim()
						{
							String h="    Hai am lajeem shah   ";
							
							System.out.println("Before Trim = "+h.length());
							System.out.println(h);
							
							String aftertrim=h.trim();
							System.out.println("After trim = "+aftertrim.length());
							System.out.println(aftertrim);
							
						}
	
	
							void concadination() // joining the sequence of words 
							{
								String first = "Apple";
								String second = " and orange";
								
								first=first.concat(second);
								System.out.println(first);
								
							}
							
							void ASCII_value()
							{
								String s="India";
								int sum=0;
								
								for(int i=0;i<s.length();i++)
								{
									int n=s.charAt(i);
									sum=sum+n;
								}
								System.out.println(sum);		
							}
	
	
	
	
	
	
	
	
	
		

}
