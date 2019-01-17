interface TVState{
	void handleRequest();
}
class TVStartState implements TVState{
	public void handleRequest(){
		System.out.println("TV On");
	}
}
class TVOffState implements TVState{
	public void handleRequest(){
		System.out.println("TV Off");
	}
}
class TVContext implements TVState{
	private TVState state;
	public void setTVContext(TVState tvstate){
		this.state=tvstate;
	}
	
	public void handleRequest(){
		state.handleRequest();
	}
}

public class StateTest{
	public static void main(String args[]){
		TVState onstate = new TVStartState();
		TVState offstate = new TVOffState();
		TVContext context = new TVContext();
		context.setTVContext(onstate);
		context.handleRequest();
		context.setTVContext(offstate);
		context.handleRequest();
	}
}