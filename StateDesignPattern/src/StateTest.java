interface MobileState{
	void alert(AlertStateContext asc);
}
class AlertStateContext{
	private MobileState state;
	void setMobileState(MobileState ms){
		this.state=ms;
	}
	void alert(){
		state.alert(this);
	}
}
class VibrateMobileState implements MobileState{
	public void alert(AlertStateContext alrt){
		System.out.println("Mobile is vibrating");
	}
}
class SilentMobileState implements MobileState{
	public void alert(AlertStateContext asc){
		System.out.println("Mobile is silent");
	}
}
public class StateTest {
	public static void main(String args[]){
		AlertStateContext asc = new AlertStateContext();
		asc.setMobileState(new SilentMobileState());
		asc.alert();
		asc.setMobileState(new VibrateMobileState());
		asc.alert();
	}

}
