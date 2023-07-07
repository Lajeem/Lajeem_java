package String;

public class Find_the_nonrepeative_element
{
public static void main(String args[])
{
	Find_the_nonrepeative_element obj =new Find_the_nonrepeative_element();
	obj.number();
}
void number()
{
	String s[] = {"i am learning the java"};
	
	char a[]= s.CharArray();
	
	boolean flag = false;
	
	for( int i=0;i<a.length-1;i++)
	{
		int count=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
			if(count ==1)
			{
				flag=true;
				System.out.println("Non repeative elemnts ="+ a[i]);
			}
		}
			if(flag== false)
			{
				System.out.println("Not present in the given input");
			}
		}
	
	
}
}
