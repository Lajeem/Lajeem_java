package collection;

import java.util.ArrayList;

public class List_programs 
{
	public static void main(String args[])
	{
		ArrayList l =new ArrayList();
		
		// this array can't need the size and we put the different variable in this 
		
		l.add(10);
		l.add(5);		         // int
		l.add("lajeem");        // string
		l.add(true);	       // boolean
		l.add('S');		      // char
		l.add(5.5);		     //float
		l.add(102.254); 	// double
		
		System.out.println(l);
		
		l.addAll(l);		// this print l to l -> double time its shows
		System.out.println("After the addall = " +l);
		
		System.out.println(l.contains("lajeem"));
		System.out.println(l.get(1));
		System.out.println(l.indexOf('S'));
		System.out.println(l.remove(5));
		System.out.println(l.set(5, 4.5));
		System.out.println(l);
		
		Object a[]=l.toArray(); 	// convert the array into object.
		
		for(Object s:a)
		{
			System.out.println(s);
		}
		
		 l.clear();  // it remove the all elements from  the list
		 System.out.println("After the clear = "+l);
		
		 l.isEmpty();
		 System.out.println("After empty ="+l);
	}
}
