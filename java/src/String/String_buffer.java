package String;

public class String_buffer 
{
public static void main(String args[])
{
	String s="hai";
	
	//s.toUpperCase();
	//s.concat("lajeem");
	//System.out.println(s);
	
	
	StringBuffer si= new StringBuffer(s);
	si.append(" lajeem");
	//System.out.println(si);
	
	//si.insert(0,12345);
	//si.reverse();
	
	//System.out.println(si);
	
	
	String output = si.toString();
	 System.out.println(output +" string type");
	
	
	
	
	
	
	
	
	
	
	
} 
}
