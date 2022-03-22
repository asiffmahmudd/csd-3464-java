package q3;

/**
 * See Step 04 for Instructions on how to complete the class
 * @author ENTER YOUR NAME - YOUR C#
 * @since ENTER THE DATE
 */
public class Square extends Rectangle {
	
	public Square(double xCoordinate, double yCoordinate, double length) {
		super(xCoordinate, yCoordinate, length, length);
	}
	
	public Square(Square s) {
		super(s.xCoordinate, s.yCoordinate, s.side1Length, s.side2Length);
	}
	
	public Square clone(Square s) {
		return new Square(this);
	}
	
	public String toString() {
		return "Shape: Square\n"
				+ "Centre Coordinate: (" + this.xCoordinate + ", " + this.yCoordinate + ")\n"
				+ "Angle AC: " + this.angleAC + "\n"
				+ "Side Length: " + this.side1Length;
	}
	
	public void setSideLength(double length) {
		this.setSide1Length(length);
		this.setSide2Length(length);
	}
	
	public double getLength() {
		return this.side1Length;
	}
	
}
