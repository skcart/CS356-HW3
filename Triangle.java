
public class Triangle extends Shape {

	public Triangle(Color c) {
		// Perform triangle specific actions
		super(c);
	}
	
	@Override
	public void applyColor() {
		// Perform triangle specific actions
		System.out.print("Filling triangle with color ");
		color.applyColor();
	}

}
