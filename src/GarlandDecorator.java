
public class GarlandDecorator extends Decorator {

	public GarlandDecorator(IChristmasTree tree) {
		// TODO Auto-generated constructor stub
		super(tree);
	}

	@Override
	public String decorate() {
		// TODO Auto-generated method stub
		return super.decorate()+" Decorated with Garland ";
	}

}
