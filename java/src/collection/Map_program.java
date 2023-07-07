package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_program 
{
	public static void main(String[] args) 
	{
		//Mapping obj = new Mapping ();
		
		Map<Integer,String>  m= new  HashMap<Integer,String>();
		
		// map display like the {= bracket and equals symbols
		
		m.put(1,"Lajeem");
		m.put(2,"Shah");
		m.put(3,"Kiran");
		m.put(4,"Ahamed");
		m.put(5,"deli");
		m.put(6,"liya");
		System.out.println(m);
		
		m.replace(1,"Ahamed");
		m.replace(3,"Lajeem");
		System.out.println("After the replace = "+m);
		
		m.remove(5,"deli");
		System.out.println(m);
		
		System.out.println(m.keySet());   // display the key elements	
		System.out.println(m.values());   // display the value elements
		System.out.println(m.entrySet()); // display the both key and values 
	}

}
