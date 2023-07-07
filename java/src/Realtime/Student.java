package Realtime;

import java.util.Objects;

public class Student {
	private String name;
	private int reg_no;
	private String dept;
	private String village;
	private String college_name;

	Student() 
	{
		System.out.println("Kindly Please come with details");
	}

	Student(String name) 
	{
		this.name = name;
	}
	
	Student(String name, String dept) 
	{
		this.name = name;
		this.dept = dept;
	}
	
	Student(String name,String village,String college_name)
	{
		this.name=name;
		this.village=village;
		this.college_name=college_name;
	}

	Student(String name, int reg_no) 
	{
		this.name = name;
		this.reg_no = reg_no;
	}

	Student(String name, int reg_no, String dept) 
	{
		this.name = name;
		this.reg_no = reg_no;
		this.dept = dept;
	}

	Student(String name, int reg_no, String dept, String village) 
	{
		this.name = name;
		this.reg_no = reg_no;
		this.dept = dept;
		this.village = village;
	}
	
	Student(String name, int reg_no, String dept, String village, String college_name) 
	{
		this.name = name;
		this.reg_no = reg_no;
		this.dept = dept;
		this.village=village;
		this.college_name = college_name;
	}

	void setreg_no(int reg_no) 
	{
		this.reg_no = reg_no;
	}

	void setdept(String dept) 
	{
		this.dept = dept;
	}

	void setvillage(String village) 
	{
		this.village = village;
	}

	void setcollege_name(String college_name) 
	{
		this.college_name = college_name;
	}

	int getreg_no() 
	{
		return reg_no;
	}

	String getdept() 
	{
		return dept;
	}

	String getvillage() 
	{
		return village;
	}

	String getcollege_name() 
	{
		return college_name;
	}

	public String toString() 
	{
		return ("Student name = " + name +"\n"+ " Student reg_no = " + reg_no+"\n" + "Student dept = " + dept
				+"\n"+ " Student village = " + village+"\n" + "Student college_name = " + college_name);
	}
}
