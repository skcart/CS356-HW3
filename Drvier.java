
public class Drvier {
	public static void main(String[] args) {
		Shape triangle = new Triangle(new YellowColor());
		triangle.applyColor();
		
		Shape square = new Square(new GreenColor());
		square.applyColor();
	}
}
