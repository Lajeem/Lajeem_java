package String;

public class Employee {
 
	private int employe_id;
	private String name;
	private int age;
	
	public int getEmploye_id() {
		return employe_id;
	}
	public Employee() {
		super();
		
	}
	public void setEmploye_id(int employe_id) {
		this.employe_id = employe_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employe_id=" + employe_id + ", name=" + name + ", age=" + age + "]";
	}
}
