
public class Square extends Shape {

	public Square(Color c) {
		// Perform square specific actions
		super(c);
	}
	
	@Override
	public void applyColor() {
		// Perform square specific actions
		System.out.print("Filling triangle with color ");
		color.applyColor();
	}
}
