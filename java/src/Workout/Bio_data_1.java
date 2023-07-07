package Workout;

public class Bio_data_1 
{
public static void main(String[] args) 
{
	Bio_data name =new Bio_data();
	
	name.setName("Makalu");
	name.setFather_name("Ahamed");
	name.setMother_name("Faritha");
	name.setBlood_gruop("o+");
	name.setAddress("1/123 west street");
	name.setPhone_number(12345678910l);
	name.setEmail_id("lajeemshah@gnail.com");
	
	System.out.println(name.toString());
}
}
