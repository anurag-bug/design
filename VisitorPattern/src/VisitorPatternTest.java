//visitable interface
interface Router{
	void send(char c);
	void receive(char c);
	void accept(RouterVisitor visitor);
	
}
//Concrete Visitable
class DLink implements Router{
	public void send(char c){
		System.out.println("Data sent from DLink");
	}
	public void receive(char c){
		System.out.println("Data received from DLink");
	}
	public void accept(RouterVisitor visitor){
		visitor.visit(this);
	}
}
//concrete visitable
class TPlink implements Router{
	public void send(char c){
		System.out.println("Data sent from TPlink");
	}
	public void receive(char c){
		System.out.println("Data received from TPlink");
	}
	public void accept(RouterVisitor visitor){
		visitor.visit(this);
	}
}
//visitor interface
interface RouterVisitor{
	public void visit(TPlink tlink);
	public void visit(DLink dlink);
}
// concrete visitor
class LinuxConfig implements RouterVisitor{
	public void visit(TPlink tlink){
		System.out.println("Linux configuration done for TPlink");
	}
	public void visit(DLink dlink){
		System.out.println("Linux configuration done for Dlink ");
	}
}
// concrete visitor
class WindowsConfig implements RouterVisitor{
	public void visit(TPlink tlink){
		System.out.println("Windows configuration done for TPlink");
	}
	public void visit(DLink dlink){
		System.out.println("Windows configuration done for Dlink ");
	}
}



public class VisitorPatternTest {
	public static void main(String args[]){
	Router tprouter = new TPlink();
	Router drouter = new DLink();
	RouterVisitor lconfig = new LinuxConfig();
	RouterVisitor wconfig = new WindowsConfig();
	tprouter.accept(lconfig);
	drouter.accept(wconfig);
	
	}
}
