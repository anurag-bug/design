abstract class Fighter{
	private KickBehavior kb;
	private JumpBehavior jb;
	public void jump(){
		jb.jump();
	}
	public void kick(){
		kb.kick();
	}
	public void roll(){
		System.out.println("This is default roll");
	}
	public void setJumpBehavior(JumpBehavior jb){
		this.jb=jb;
	}
	public void setKickBehavior(KickBehavior kb){
		this.kb=kb;
	}
	abstract void punch();
	
}
interface KickBehavior{
	void kick();
}
interface JumpBehavior{
	void jump();
}
class NormalKick implements KickBehavior{
	public void kick(){
		System.out.println("This is normal kick");
	}
}
class FastKick implements KickBehavior{
	public void kick(){
		System.out.println("This is fast kick");
	}
}
class NormalJump implements JumpBehavior{
	public void jump(){
		System.out.println("This is normal jump");
	}
}
class FastJump implements JumpBehavior{
	public void jump(){
		System.out.println("This is fast Jump");
	}
}
class IndianFighter extends Fighter{
	public void punch(){
		System.out.println("This is Indian puch");
	}
}
class ChineseFighter extends Fighter{
	public void punch(){
		System.out.println("This is Chinese punch");
	}
}
public class StrategyPatternTest {
	public static void main(String args[]){
	Fighter ifighter=new IndianFighter();
	Fighter cfighter=new ChineseFighter();
	JumpBehavior njb= new NormalJump();
	JumpBehavior fjb = new FastJump();
	KickBehavior nkb = new NormalKick();
	KickBehavior fkb = new FastKick();
	ifighter.setJumpBehavior(njb);
	cfighter.setJumpBehavior(fjb);
	ifighter.setKickBehavior(nkb);
	cfighter.setKickBehavior(fkb);
	ifighter.kick();
	cfighter.kick();
	ifighter.jump();
	cfighter.jump();
	ifighter.jump();
}
}
