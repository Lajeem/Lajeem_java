package Forloop;

public class Even
{
	public static void main(String arga[])
	{
		Even obj= new Even();
					obj.numbers();
	}
	public void numbers()
	{ 
		int count =0;
		for(int num=2 ;count<5;count++)
		{
			System.out.print(num);
			num=num+2;
		}
	}	
}
