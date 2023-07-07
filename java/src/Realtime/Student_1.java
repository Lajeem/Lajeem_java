package Realtime;

public class Student_1 
{
	public static void main(String args[]) 
	{
		Student lajeem = new Student("Lajeem",4021,"Mechanical","Ramnad","Dhaanish");
		
		Student kiran = new Student("Kiran",4020);
		
		Student liya=new Student ("Liya","panikulam"," Al-hira");
		
		Student deli=new Student("Deli");
		
		//kiran ku
		  kiran.setdept("Mechanical");
		  	kiran.getdept();
				kiran.setcollege_name("Dhaanish"); 
					kiran.getcollege_name();
						kiran.setvillage("Ramnad");
							kiran.getvillage();
		
							/*
							 * //obj ku lajeem.setdept("Mechanical"); lajeem.getdept();
							 */
		 	
		 	//liya ku
				liya.setdept("5");
				liya.getdept();
				liya.setreg_no(2023);
				liya.getreg_no();
				
				
				
				
	System.out.println(lajeem);	 
	System.out.println();
	System.out.println(kiran.toString());
	System.out.println();
	System.out.println(liya.toString());	
	System.out.println();
	System.out.println(deli);
		

	
	}

}
