import Projector.Projector;
class PopcornPopper{
	public void startPopping(){
		System.out.println("Popping started");
	}
	public void stopPopping(){
		System.out.println("Popping stopped");
	}
}

class DVDPlayer{
	public void startPlaying(){
		
		System.out.println("Movie started");
	}
	public void stopPlaying(){
		System.out.println("Movie stopped");
	}
	public void setVolume(){
		System.PrintStream.println("Voume set to level 5");
	}	
}

class HomeTheatreFacade{
	PopcornPopper pop = new PopcornPopper();
	DVDPlayer dp = new DVDPlayer();
	Projector projector = new Projector();
	public void startMovie(){
		pop.startPopping();
		dp.startPlaying();
		dp.setVolume();
		projector.startProjector();
	}
	public void stopMovie(){
		pop.stopPopping();
		dp.stopPlaying();
		projector.stopProjector();
		
	}
	
}
public class FacadePatternClient{
	public static void main(String args[]){
		HomeTheatreFacade htf = new HomeTheatreFacade();
		htf.startMovie();
		htf.stopMovie();
	}
}