package String;

public class Lexicographically 
{
	public static void main(String args[])
	
	// sorting the given String by using lexicographically
		{
		String d []= {"apple","orange","grapes","lemon"};
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i].compareTo(d[j])>0)
				{
					String temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
}
