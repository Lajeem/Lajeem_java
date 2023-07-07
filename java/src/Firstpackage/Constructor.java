package Firstpackage;

public class Constructor 
{
	private int Account_number;
	private String Name;
	private String Pan_number;
	private int Account_balance;
	private String ifsc_code;
	private String Bank_name;
	
	Constructor() 							//no arguments given
	{
		this.ifsc_code = "icic3852098";
		this.Bank_name ="icici";
	}
	Constructor(String Name,String Pan_number)	//with aruguments 
	{
		this();
		this.Name=Name;
		this.Pan_number=Pan_number;
	}
	// setter the variable 
	
	void  setAccount_number(int Account_number)
	{
		this.Account_number=Account_number;
	}
	void setAccount_balance(int Account_balance)
	{
		this.Account_balance= Account_balance;
	}
	//getter the varaible
	
	void getAccount_number()
	{
		System.out.println( Account_number);
	}
	void getAccount_balance()
	{
		System.out.println (Account_balance);
	}
	void display()
	{  
		System.out.println( this.Account_number + " " + this.Account_balance + " ");
		System.out.println("ifsi code = "+ifsc_code+"\n"+"bank name = "+Bank_name+"\n "+"Name is "+this.Name +"\n"+ "Pan_number is "+this.Pan_number );
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

