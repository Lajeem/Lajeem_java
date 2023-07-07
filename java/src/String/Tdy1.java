package String;

public class Tdy1 
{
	public static void main(String[] args)
	{
		Tdy1 obj=new Tdy1();
		System.out.println("obj = "+obj.hashCode());
		Tdy1 obj1=new Tdy1();
		System.out.println("obj 1 ="+obj1.hashCode());
		
		System.out.println();
		
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		
		System.out.println();
		
		String obj2=new String("hi");
		System.out.println("obj 2 ="+obj2.hashCode());
		String obj3=new String("hi");
		System.out.println("obj 3 ="+obj3.hashCode());
		
		System.out.println();
		
		System.out.println(obj2.equals(obj3));
		System.out.println(obj2==obj2);
		
		System.out.println();
		
		String s="welcome";
		String s1="WELCOME";
		String s2="welcome";
		System.out.println("String s ="+s.hashCode());
		System.out.println("String s1 = "+s1.hashCode());
		System.out.println("String s2 = "+s2.hashCode());
		
		System.out.println();
		
		
		  System.out.println(s==s2); 
		  System.out.println(s==s1);
		  System.out.println(s1==s2);
		 
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));

	}

	@Override
	public String toString() {
		return "Tdy1 []";
	}

}
