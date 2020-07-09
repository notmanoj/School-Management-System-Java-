package SchoolManagementSystem;

public class Teacher {
	private String name;
	private int id;
	private int salary;
	private int salaryearned;
	
	public Teacher(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryearned=0;
		
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	public void updatesalary(int salary) {
		this.salary=salary;
	}
	public void receiveSalary(int salary) {
		salaryearned+=salary;
		School.updateTotalmoneyearned(salary);
	}
	public String toString() {
		return "Teacher name:" +name +
				"\nSalary:" +salary;
	}
}
