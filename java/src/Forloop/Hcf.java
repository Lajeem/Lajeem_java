package Forloop;

public class Hcf 
{
	public static void main(String args[])
		{
		Hcf obj=new Hcf();
			obj.numbers(8,16,4);
		}
		public void numbers(int a,int b ,int c)
		{
			int factor=0;
			int d=(a<b)? a:b;
			int small=d>c ? d:c;
			for(int i=1;small>=i;i++)
			{
				if(a%i==0 && b%i==0 && c%i==0)
				{
					factor=i;
				}
			}
			System.out.println(factor + " is the highest common factor");
		}
}
