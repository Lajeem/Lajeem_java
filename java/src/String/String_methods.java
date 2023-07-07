package String;

public class String_methods 
{
public static void main(String args[])
{
	String_methods obj=new String_methods ();
	obj.number();
}
void number()
{
	    // copyValueOf() method
	
		char[] s1= {'H','E','L','O'};  
		String s2="l";
		s2=s2.copyValueOf(s1);

		System.out.println("Copy value s2 = "+s2);
System.out.println();

	   //valueOf()
System.out.println("ValueOf()");

		int i=5;
		char c ='z';
		boolean flag = true;
		double d =1.25;
		
		String k=String.valueOf(i);
		k=k+String.valueOf(c);
		k=k+String.valueOf(flag);
		k=k+String.valueOf(d);
		
		System.out.println(k);
		
		/*
		 * String k1=String.valueOf(k+d); System.out.println(k1);
		 * 
		 * String k2=String.valueOf(k+d+flag); System.out.println(k2);
		 * 
		 */
System.out.println();
       //compareTo() 

	    String a1 = "lajeem";			
 	    String a2 = "shah";
 	    String a3="lajeem";
 	    
	    System.out.println("Compare to = "+a1.compareTo(a2)); 
System.out.println();
		//end pointAt()  
	    
	    String st= "Lajeem";				
	    int ss=st.codePointAt(4);
	    System.out.println("End point = "+ss);
System.out.println();				    
	    //StartWith()
	    
	    System.out.println("STARTWITH");
	    
	    String rt="Payilagam";
	    System.out.println(rt.startsWith("a"));
	    System.out.println(rt.startsWith("pa"));
	    System.out.println(rt.startsWith("Pa"));
	    System.out.println(rt.startsWith("am"));
System.out.println();									    
	    // endWith() method
	    
	    System.out.println("ENDWIDTH");
	    
	    String A="lajeem";						
	    System.out.println(A.endsWith("m"));
	    System.out.println(A.endsWith(A));
	    System.out.println(A.endsWith("laj"));
	    
System.out.println();							    
	    // lastindexOf() method
	    System.out.println("LASTINDEXOF");
	    
	    String set="am lajeem from ramanathapuram and am engineering graduate";
	    System.out.println ("Last index = "+set.lastIndexOf("and"));
	    
System.out.println();    
	    //Strip,StripLeading,StripTrailing
	    
	    System.out.println("STRIP,STRIPLEADING,STRIPTRAILING");
	    String m=" app l e  ";
	    System.out.println(m.strip());
	    System.out.println(m.strip().length()); // to see the length of the sequence
	    System.out.println(m.stripLeading());
	    System.out.println(m.stripTrailing());
		    
System.out.println();	    
		 //replace,replaceAll,replaceFirst
	    
	     System.out.println("REPLACE");
	    
		 String e="I study the science"; 
		 String j=e.replaceAll("e","E");
		 String j1=e.replaceAll("e","E");
		 String j2=e.replaceFirst("e","E");
		// String j3=e.replace("Study", "Studied");
		 System.out.println(j);
		 System.out.println(j1);
		 System.out.println(j2);
		// System.out.println(j3);
		 
System.out.println();		 
	    //CodePointCount() if we want to  find the index value means use the codepointcount
		  				// it calculate the beginindex-endindex
		  
	     System.out.println("CODEPOINTCOUNT");
	     
	     String str = "Helloworld";
	     int beginindex=2;
	     int endindex=6;
	     
	     System.out.println("CodePointCount = "+ str.codePointCount(beginindex, endindex));
	     System.out.println("CodePointCount = "+ str.codePointCount(0,8));
	     //System.out.println("CodePointCount = "+ str.codePointCount(8,0));
		
System.out.println(); 
		 //contains()   it contain same  case its true not same case means false
	     
	     System.out.println("CONTAIN");
	     String l="Apple";
	     
	     System.out.println(l.contains("Ap"));
	     System.out.println(l.contains(" Ap"));
	     System.out.println(l.contains("Ap "));
	     System.out.println(l.contains("le"));
	     System.out.println(l.contains("pp"));
	    
System.out.println();						     
	    //contentEquals  it accept the same as well as the given string equals 
	     				// if we give the one letter it cant accept 
	     
	     System.out.println("CONTENTEQUALS");
	     String o="lajeem";
	     System.out.println(o.contentEquals(o));
	     System.out.println(o.contentEquals("laj"));
	     System.out.println(o.contentEquals("m"));
	     System.out.println(o.contentEquals("lajeem"));

System.out.println();
		// indexOf()	
	     
	     System.out.println("IndexOf");
	     
	     String in ="The chennai city ";
	     System.out.println("IndexOf ="+ in.indexOf("city"));
	     
System.out.println();	     
	     
	   //Split()

	String p ="apple orange cake bike";
	String []arr = m.split(" ");
	
	String []arr=["apple","orange","cake","bike"];
				
		
	     
	     
	     
	     
	     
	    
}
}
