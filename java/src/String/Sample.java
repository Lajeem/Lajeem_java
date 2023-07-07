package String;

public class Sample 
{
public static void main(String args[])
{
	Sample obj=new Sample ();
		  obj.number();
		 
		  System.out.println(obj);
		  
		  System.out.println("Using new keyword2");
		  String laj = new String ("lajeem");
		  System.out.println(laj);
}
void number()
{							// If we put the string as the data type with other data type it change as all into string 
	String age = "25";
	int a=1;
	int b = 10;
	
	System.out.println("Concantenation of the given String");
	System.out.println();
	System.out.println(age +a+b); //string + int +int its looks all as string.
								  // Output = 25110 

	
	// Call the int  array to  string object
	
	//String age1 ="45";
	//int a1[]= {8,9,6,4};
	
	//String b1= new String(a1); // The constructor String (int []is undefined.
	
	//System.out.println(b1);
	
	//Call byte array to string object.
	
	String age2="27";
	
	byte a2[]= {76,65,74,69,69,77};
	byte a3[]= {83,72,65,72};
	
	String b2= new String(a2);
	String b3= new String(a3);
	
	System.out.println("It print the Ascii value");
	System.out.println();
	System.out.println(b2+" "+b3);
	
}
}










		//int a[]= {1,8,7,9,6};