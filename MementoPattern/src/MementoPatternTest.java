import java.util.List;
import java.util.ArrayList;
class Originator{
	private String state;
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state=state;
	}
	public Memento saveToMemento(){
		Memento memento = new Memento(state) ;
		return  memento;
	}
	public void getStateFromMemento(Memento memento){
		this.state=memento.getState();
	}
}
class Memento{
	private String state;
	public Memento(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}

class CareTaker{
	private List<Memento> saved_mementos=new ArrayList<Memento>();
	public void addMemento(Memento memento){
		saved_mementos.add(memento);
	}
	public Memento getMemento(int pos){
		return saved_mementos.get(pos);
	}
	
}
public class MementoPatternTest{
	public static void main(String args[]){
		Originator orgn = new Originator();
		CareTaker ctaker = new CareTaker();
		orgn.setState("State 1");
		ctaker.addMemento(orgn.saveToMemento());
		orgn.setState("State 2");
		ctaker.addMemento(orgn.saveToMemento());
		System.out.println("Current state is "+orgn.getState());
		orgn.getStateFromMemento(ctaker.getMemento(0));
		System.out.println("Current state is "+orgn.getState());
		orgn.getStateFromMemento(ctaker.getMemento(1));
		System.out.println("Current state is "+orgn.getState());
	}
	

}
