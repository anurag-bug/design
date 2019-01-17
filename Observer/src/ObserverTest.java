import java.util.List;
import java.util.ArrayList;
interface Subject{
	void notifyObserver();
	void registerObserver(Observer obj);
	void unregisterObserver(Observer obj);
}
class CricketData implements Subject{
	private int run;
	private int over;
	private int wicket;
	private List<Observer> observerList;
	public CricketData(){
		observerList= new ArrayList<Observer>();
	}
	public void registerObserver(Observer obj){
		observerList.add(obj);
	}
	public void unregisterObserver(Observer obj){
		observerList.remove(observerList.indexOf(obj));
	}
	public void notifyObserver(){
		for(Observer obj: observerList){
			obj.update(run,wicket,over);
		}
	}
	public void dataChanged(){
		this.run=getLatestRun();
		this.over=getLatestOver();
		this.wicket=getLatestWicket();
		notifyObserver();
	}
	public int getLatestWicket(){
		return 2;
	}
	public int getLatestRun(){
		return 200;
	}
	public int getLatestOver(){
		return 10;
		
	}
	
}
interface Observer{
	void update(int run,int wicket,int overs);
}
class AverageScoreDisplay implements Observer{
	private int runRate;
	private int predictedScore;
	public void update(int run,int wicket,int overs){
		this.runRate=run/overs;
		this.predictedScore=runRate*50;
		display();
	}
	public void display(){
		System.out.println("Run rate: "+runRate+"Predicted Score: "+predictedScore);
	}
	
}
class CurrentScoreDisplay implements Observer{
	int runs;
	int wickets;
	int overs;
	public void update(int run,int wicket,int overs){
		this.runs=run;
		this.wickets=wicket;
		this.overs=overs;
		display();
	}
	public void display(){
		System.out.println("Run "+runs+"Wicket"+ wickets+"Overs "+overs);
	}
}
public class ObserverTest {
	public static void main(String[] args){
		CurrentScoreDisplay csd = new CurrentScoreDisplay();//observers
		AverageScoreDisplay asd = new AverageScoreDisplay();
		CricketData cd = new CricketData();
		cd.registerObserver(csd);
		cd.registerObserver(asd);
		cd.dataChanged();
		cd.unregisterObserver(asd);
		cd.dataChanged();
		
	}
	

}
