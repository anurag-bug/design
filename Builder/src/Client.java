
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new EmployeeBuilder().setAge(50).
						setFirstName("Anurag").setLastName("Harsh").
						build();
		
		//otherwise long constructor like this
//		Employee emp = new Employee("asd","dsa", "sdasda", "adssad");
		System.out.println(emp.toString());
	
	}

}
