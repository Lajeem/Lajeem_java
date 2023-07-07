package Firstpackage;

public class Constructor1 
{
	public static void main(String[] args) 
	{
		Constructor lajeem=new Constructor("lajeem","t3457");
		Constructor kiran=new Constructor();
		lajeem.display();
		kiran.display();
					
		lajeem.setAccount_number(323123213);
		lajeem.setAccount_balance(5000);
		kiran.setAccount_number(323803213);
		kiran.setAccount_balance(76000);
		lajeem.display();
		kiran.display();
	//	Makl.display();
	//	Md.display();
		
	
	}

}
