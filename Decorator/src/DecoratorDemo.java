public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Success");
		IChristmasTree tree = new LightsDecorator(new GarlandDecorator(new ChristmasTreeImpl()));
		System.out.println(tree.decorate());

	}

}
