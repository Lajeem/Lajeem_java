package whileloop;

public class Armstrong 
{
public static void main(String[] args)
{
	int n=153;
	//int sum1=0;
	int sum=0;
	
	 while(n>0)
	 {
		 int mod =n%10;
		 sum=sum+mod*mod*mod;
		  n=n/10; 
	 } 
	 System.out.println(sum);	
		/*
		 * if(n==sum) { System.out.println("The given number is armstrong"); } else {
		 * System.out.println("The given number is not a armstrong"); }
		 */
	
}
}
