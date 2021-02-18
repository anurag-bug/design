public abstract class Decorator implements IChristmasTree {
	
	private IChristmasTree tree;
	
	Decorator(IChristmasTree tree) {
		this.tree = tree;
	}
	
	@Override
	public String decorate() {
		return tree.decorate();
	}

}
