package Firstpackage;
                       // using this();

public class Hotel extends List
{
	Hotel()
	{
		 System.out.println("give a water");
	}
	Hotel(int amount,String parcel)
	{
		super();
		System.out.println("provide food");
		System.out.println("Extra charges");
	}
	Hotel(int amount_high)
	{
		this();
		System.out.println("Given discount");
	}
	Hotel(int amount_high,String Ac_hall,String Veg_food)
	{
		this();
		System.out.println("Give a coupon for travel");
	} 
	void display()
	{
		System.out.println();
	}
	 public static void main(String[] args) 
		{
		 Hotel obj1=new Hotel();
		 Hotel obj2=new Hotel(4500,"parcel");
		 Hotel obj3=new Hotel(7800);
		 Hotel obj4=new Hotel(9800,"Ac","veg food");
		}
}
	


