package String;

public class Count_the_vowels 
{
 public static void main(String args[])
 {
	 
	 //1) count the number of vowels present in the string
	 
	 String s="India is my country";
	 
	 int count=0;
	 
	 for(int i=0;i<s.length();i++)
	 {
		 if (s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u')
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
	 
	 
	 // 2)count each vowels present in the string 
	 
	 String ss ="";
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //3) find the number is present in array
	 
	 String l="India celebrate the 71 independent day";
	 
	 for(int i=0;i<l.length();i++)
	 {
		 int num= l.charAt(i);
		 
		 if(num<=57 && num>=48)
		 {
			 System.out.println("Number change in tha array = "+(char)num);
		 } 
	 }
	 
	
	 //4) Reverse the given String
	 
	 String h= "India is my counrty all india are my brother and sister";
	 String hh="";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 hh=hh+h.charAt(i);
	 }
	 
	 System.out.println("reverse the value = "+hh);
	
	 if(hh==h)
	 {
		 System.out.println("It is palindrome");
	 }
	 
	 else
	 {
		 System.out.println("It is palindrome");
	 }
	 //5) palindrome or not s
	 
	 
	 
	
	 
	 
	 
	 
		
	 
	 
	 
	 
}
}