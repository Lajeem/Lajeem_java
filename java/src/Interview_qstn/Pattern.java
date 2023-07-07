package Interview_qstn;

public class Pattern 
{
	public void number()
	{
		int row=1;
		while(row<=4)
		{
			int column=1;
			while(column<=row)
			{
				System.out.print(column);
				column++;
			}
			row++;	
			System.out.println();
		}
	}
public static void main (String args[])
{
	Pattern obj= new Pattern();
		obj.number();
}
}
