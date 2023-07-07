package Array;

import java.util.Scanner;

public class Sum_avg_reverse 
{
   public static void main(String[] args)
   	{
	   Sum_avg_reverse obj= new Sum_avg_reverse();
	          obj.number();
   	}
	        
   void number()
   {
        
	    Scanner s = new Scanner(System.in);
	   	System.out.println("Enter the size");
	   	
	  	int size= s.nextInt();
	  	int age[]=new int[size];
	  	
	  	System.out.println("Enter the age"); 	
	  	for( int index=0;index<age.length;index++)
	  	{
	  		age[index]=s.nextInt();
	  	}
	  	
	  	
	  	//display the age
	  	System.out.println("Display the age : ");
	  	for( int index =0;index< age.length;index++)
	  	{
	  		System.out.println( age[index]);
        }
	  	System.out.println();
	  	
	  	//sum of the age
	  	int sum=0;
	  	for(int index=0;index<age.length;index++)
	  	{
	  		sum=sum+age[index];
	  	}
	  	System.out.println("Sum of the age is =" + sum);
	  	System.out.println();
	  	
	  	// average of the age
	  	
	  	int avg=0;
	  	for(int index=0;index<age.length;index++)
	  	{
	  		avg=sum/age.length;
	  	}
	  	System.out.println("Average of the age ="+avg);
	  	System.out.println();
	  	
	  	//reverse the number
	  	for( int index=age.length-1;index>=0;index--)
	  	{
	  		System.out.println("Reverse the given age ="+ age[index]);
	  		
	  	}
	  	s.close();
   }
}
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
   

	
	   	

   
	 
   
	  
	   	
	   	
	   	
	   	
	   	
	   	