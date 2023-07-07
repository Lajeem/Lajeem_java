package Interview_qstn;

public class Over_loaded extends Over_loaded1
{
public static void main(String args[])
{
	Over_loaded obj=new Over_loaded();
	obj.numbers();
}
static void numbers()
{
	int a=65;
	System.out.println(a);
}
}
