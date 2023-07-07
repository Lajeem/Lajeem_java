package Workout;

import java.util.Objects;

public class Bio_data 
{
	private String Name;
	private String father_name;
	private String Mother_name;
	private String Blood_gruop;
	private String Address;
	private long Phone_number;
	private String Email_id;
	
	Bio_data()
	{
		System.out.println("Give the details");
	}
	Bio_data(String Name,int Phone_number)
	{
		this.Name=Name;
		this.Phone_number=Phone_number;
	}
	
	Bio_data(String Name,String Father_name)
	{
		this.Name=Name;
		this.father_name=Father_name;
	}
	
	Bio_data(String Name,String Father_name,String Mother_name)
	{
		this.Name=Name;
		this.father_name=Father_name;
		this.Mother_name=Mother_name;
	}
	
	Bio_data(String Name,String Father_name,String Mother_name,String Blood_group)
	{
		this.Name=Name;
		this.father_name=Father_name;
		this.Mother_name=Mother_name;
		this.Blood_gruop=Blood_group;
	}
	
	Bio_data(String Name,String Father_name,String Mother_name,String Blood_group,String Address)
	{
		this.Name=Name;
		this.father_name=Father_name;
		this.Mother_name=Mother_name;
		this.Blood_gruop=Blood_group;
		this.Address=Address;
	}
	
	Bio_data(String Name,String Father_name,String Mother_name,String Blood_group,String Address,String Email_id)
	{
		this.Name=Name;
		this.father_name=Father_name;
		this.Mother_name=Mother_name;
		this.Blood_gruop=Blood_group;
		this.Address=Address;
		this.Email_id=Email_id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return Mother_name;
	}
	public void setMother_name(String mother_name) {
		Mother_name = mother_name;
	}
	public String getBlood_gruop() {
		return Blood_gruop;
	}
	public void setBlood_gruop(String blood_gruop) {
		Blood_gruop = blood_gruop;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(long phone_number) {
		Phone_number = phone_number;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, Blood_gruop, Email_id, Mother_name, Name, Phone_number, father_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bio_data other = (Bio_data) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Blood_gruop, other.Blood_gruop)
				&& Objects.equals(Email_id, other.Email_id) && Objects.equals(Mother_name, other.Mother_name)
				&& Objects.equals(Name, other.Name) && Phone_number == other.Phone_number
				&& Objects.equals(father_name, other.father_name);
	}
	@Override
	public String toString() {
		return "Bio_data"+"\n"+"Name=" + Name +"\n"+ "father_name=" + father_name +"\n"+ "Mother_name=" + Mother_name+"\n"
				+ "Blood_gruop=" + Blood_gruop +"\n"+"Address=" + Address +"\n"+"Phone_number=" + Phone_number+"\n"
				+ "Email_id=" + Email_id ;
	}
	
}
