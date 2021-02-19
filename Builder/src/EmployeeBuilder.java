
public class EmployeeBuilder {

	Employee emp;
	public EmployeeBuilder() {
		// TODO Auto-generated constructor stub
		this.emp = new Employee();
	}
	
	public EmployeeBuilder setAge(int age) {
		this.emp.setAge(age);
		return this;
	}
	
	public EmployeeBuilder setFirstName(String fName) {
		this.emp.setFirstName(fName);
		return this;
	}
	
	public EmployeeBuilder setLastName(String lName) {
		this.emp.setLastName(lName);
		return this;
	}
	
	public EmployeeBuilder setMiddleName(String mName) {
		this.emp.setMiddleName(mName);
		return this;
	}
	
	public Employee build() {
		return this.emp;
	}

}
