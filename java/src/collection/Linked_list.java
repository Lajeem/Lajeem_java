package collection;

import java.util.LinkedList;

public class Linked_list 
{
	public static void main(String[] args)
	{
		//<> its a generic , <String> ,<Integer>,Generic means we say the if String means its only allows String 
		//  type variable

		LinkedList<String>  ll = new LinkedList(); 	
		
		ll.add("Lajeem");
		ll.add("Shah");
		ll.add("Kiran");
		ll.add("laptop");
		
		System.out.println(ll);
		
		LinkedList<String>  ll1 = new LinkedList(); 
		
		ll1.add("Makl");
		ll1.addAll(ll);
		
		System.out.println(ll1);
		
		ll.addFirst("Ahamed");
		System.out.println(ll);
		
		ll.remove("Ahamed");
		System.out.println(ll);
		
		
		ll.clear();
		System.out.println("After the clear = "+ll);
		
		
		
	}

}
