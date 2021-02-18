
public class LightsDecorator extends Decorator{

	public LightsDecorator(IChristmasTree tree) {
		// TODO Auto-generated constructor stub
		super(tree);
	}

	@Override
	public String decorate() {
		// TODO Auto-generated method stub
		return super.decorate()+" decorated with Lights ";
	}

}
