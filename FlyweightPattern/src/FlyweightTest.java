import java.util.HashMap;
class Circle{
	private String color;
	public Circle(String color) {
		this.color=color;
	}
	public void drawCircle(int x,int y,int r) {
		System.out.println("Circle is drwan with radius"+r+"and coordinates"+x+y+"and color"+color);
	}
}
class CircleFactory{
	private static HashMap<String, Circle> map = new HashMap<>(); 
	public static Circle createCircle(String color) {
		Circle c;
		c=map.get(color);
		if(c!=null) {
		System.out.println("returning existing object");
			return c;
			}
		
		else { c=new Circle(color);
		map.put(color, c);
		return c;
		}
	}
}
public class FlyweightTest {
	public static void main(String args[]) {
		CircleFactory cf = new CircleFactory();
		Circle c1=CircleFactory.createCircle("red");
		c1.drawCircle(1,2,3);
		c1=CircleFactory.createCircle("blue");
		c1=CircleFactory.createCircle("red");
		
	}

}
