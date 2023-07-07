package Forloop;

public class Add_count     //count the numbers 
{
	public static void main(String args[])
	{
		Add_count obj = new Add_count();
		          obj.print_5odd_num();
		          obj.print_odd_num_within_range_of10();	
	}
	
	// This method is for 
	// Print first 5 odd number's
	public void print_5odd_num()
	{
		System.out.println("Print first 5 odd number's");
		int num = 1;
		for(int i=1;i<=5;i++) {
			System.out.println(num);
			num= num+2;
		}
	}
		
	    // This method is for
	    // Print odd number's with in range of 10
		public void print_odd_num_within_range_of10()
		{
			System.out.println("Print odd number's with in range of 10");
			for(int i=1;i<=10;i++) {
				if(i%2!=0) {
				System.out.println(i);
				}
			}
	}
}