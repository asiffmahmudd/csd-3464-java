package q3;

/**
 * See Step 03 for Instructions on how to complete the class
 * @author ENTER YOUR NAME - YOUR C#
 * @since ENTER THE DATE
 */
public class Rectangle extends Parallelogram {
	
	public Rectangle(double xCoordinate, double yCoordinate, double length, double width) {
		super(xCoordinate, yCoordinate, length, width, 90, 90);
	}
	
	public Rectangle(Rectangle r) {
		super(r.xCoordinate, r.yCoordinate, r.side1Length, r.side2Length, 90, 90);
	}
	
	
	public Rectangle clone() {
		return new Rectangle(this);
	}
	
	public String toString() {
		return "Shape: Rectangle\n"
				+ "Centre Coordinate: (" + this.xCoordinate + ", " + this.yCoordinate + ")\n"
				+ "Angle AC: " + this.angleAC + "\n"
				+ "Length: " + this.side1Length + "\n"
				+ "Width: " + this.side2Length + "\n";
	}
	
	public void setLength(double length) {
		this.side1Length = length;
	}
	
	public double getLength() {
		return this.side1Length;
	}
	
	public void setWidth(double width) {
		this.side2Length = width;
	}

	public double getWidth() {
		return this.side2Length;
	}
}
