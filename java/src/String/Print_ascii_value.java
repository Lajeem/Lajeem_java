package String;

public class Print_ascii_value 
{
public static void main(String[] args) 
{
	Print_ascii_value obj=new Print_ascii_value ();
	obj .alpabet();
	obj.number();
}

public void alpabet()
	{
		char a = 'A';	//upper case into ascii value
		char z ='Z';
		
		System.out.println("Upper case");
		System.out.println();
		
		for(int i=a;i<=z;i++)
		{
			System.out.println((a) +" = " + i);
			a++;
		}
				
					char A ='a';
					char Z ='z';			// Lower case into ascii value
					
					System.out.println("Lower case");
					System.out.println();
					
					for(int i=A;i<=Z;i++)
					{
						System.out.println((A)+"="+i);
						A++;
					}
	
	}

					void number()
					{
						char a = '0';
						char b = '9';
						
						System.out.println();
						for(int i=a;i<=b;i++)
						{
							System.out.println();
							System.out.println(a+" = "+i);
							a++;
						}
					}










}
