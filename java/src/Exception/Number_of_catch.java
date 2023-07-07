package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_of_catch 
{
	public static void main(String args[])
	{
		Number_of_catch obj=new Number_of_catch ();
					   obj.method();
	}
	void method()
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the first value");
			int a =sc.nextInt();
			
			System.out.println("Enter the Second value");
			int b =sc.nextInt();
			
			int add = a+b;
			System.out.println("Addition = "+ add);
			
			int sub =a-b;
			System.out.println("Subtraction = "+ sub);
			
			int div =a/b;
			System.out.println("Divided = "+ div);
			
			int multi[] = null;
			System.out.println("Multi = "+ 5);
		}
		
			catch(ArithmeticException add)
			{
				System.out.println("Artimetic exception ");
			}
			
				catch(InputMismatchException a)
				{
					System.out.println("Input mismatch");
				}
		
					catch(ArrayIndexOutOfBoundsException multi )
					{
						System.out.println("Array index out of bound");
					}
		
						catch(NullPointerException multi)
						{
							System.out.println("Null pointer Exception");
						}
		
							catch(Exception multi)
							{
								System.out.println("Exception");
							}
		
			finally
			{
				System.out.println("Completed");	
			}		
		}	
	}

