class Circle{
	private class CircleSpecs{
		private int radius;
		private int x;
		private int y;
		public CircleSpecs(int radius,int x,int y){
			this.radius=radius;
			this.x=x;
			this.y=y;
		}
	}
	public Circle(int radius,int x,int y){
		
		CircleSpecs cspecs = new CircleSpecs(10,20,30);
	}
}
public class PrivateClassTest {

}
