package String;
//  class notes

public class StringMethods {

	public static void main(String[] args) {
			
		String s = "Payilagam is in VELACHERY";
	
		//internally it is a character array
		//char ar[]= { 'P','a','y','i',l}
		
		//public char charAt(int)
		//public int length()
		//A =65
		//a =97
		
				
		int num =108;
		char m =(char) num;
		System.out.println(m);
	
		for(int i=0; i< s.length();i++) {
			System.out.println(s.charAt(i));// s[i]
		}
		
		String upper = s.toUpperCase();	
		System.out.println(upper);
		
		String lower = s.toLowerCase();
		System.out.println(lower);
		
		String hh = "    hai this is java   ";
		System.out.println(hh.length());//23
		
		String afterTrim= hh.trim();
		System.out.println(afterTrim.length());//16
		System.out.println(afterTrim);
		
		String first = "apple";
		String second = "oragne";
		//first = first+" and oragne";
		/*
		 * first = first.concat(first);//appleapple first = first.toUpperCase();
		 * System.out.println(first);
		 */
		second = second.concat(first).concat("mango");
		
		System.out.println(second);
		
		
	}	
	
	

}
