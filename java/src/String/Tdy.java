package String;

public class Tdy
{
	
	public String toString()
	{
		return "my to String is working";
	}
	public static void main(String ar[]) {
		Tdy obj1 = new Tdy();
		System.out.println(obj1);
		Tdy obj2 = new Tdy();
		//Object object = new Tdy();
		System.out.println(obj2);
		if(obj1==obj2){
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		
		System.out.println( obj1.getClass());
		System.out.println( obj2.getClass());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println( obj1.equals(obj1));//false
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		
		
	}
	//packageName.className@hashCode
 //if we print an object we will get the hashcode.
}
