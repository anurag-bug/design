abstract class AbstractEmployee{
	protected String name;
	public abstract boolean isNull();
	public abstract String getName();
}
class Coder extends AbstractEmployee{
	public Coder(String name){
		this.name=name;
	}
	public boolean isNull(){
		return false;
	}
	public String getName(){
		return this.name;
	}
	
}
class NoClient extends  AbstractEmployee{
	public boolean isNull(){
		return true;
	}
	public String getName(){
		return "No Employee available";
	}
}
class EmpData{
	private static final String[] empName={"anurag","ravi","krishna"};
	public static AbstractEmployee getEmployee(String name)
	{
		for( String emp:empName)
		{
			if (name==emp)
			{
				return new Coder(name);
			}
		}
		return new NoClient();
	}
}
public class NullObjectTest {
	
	public static void main(String[] args){
		
		AbstractEmployee emp1=  EmpData.getEmployee("anurag");
		System.out.println(emp1.getName());
		AbstractEmployee emp2=  EmpData.getEmployee("Saurabh");
		System.out.println(emp2.getName());
		AbstractEmployee emp3=  EmpData.getEmployee("ravi");
		System.out.println(emp3.getName());
		
		
	}

}
