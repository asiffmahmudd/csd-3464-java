package q3;
/**
 * See Step 02 for Instructions on how to complete the class
 * @author Asif Mahmud - C0837117
 * @since 03.18.2022
 */
public class Parallelogram extends Shape {
	
	/* Fields */
	protected double side1Length;
	protected double side2Length;
	protected double angleAC;
	protected double angleBD;
	
	public Parallelogram(double x, double y, double side1Length, double side2Length, double angleAC, double angleBD) {
		super(x, y);
		this.side1Length = side1Length;
		this.side2Length = side2Length;
		this.angleAC = angleAC;
		this.angleBD = angleBD;
	}
	
	public Parallelogram(Parallelogram p) {
		super(p);
		this.side1Length = p.side1Length;
		this.side2Length = p.side2Length;
		this.angleAC = p.angleAC;
		this.angleBD = p.angleBD;
	}
	
	public Parallelogram clone() {
		return new Parallelogram(this);
	}
	
	public String toString() {
		return "Shape: Parallelogram\n"
				+ "Centre Coordinate: (" + this.xCoordinate + ", " + this.yCoordinate + ")\n"
				+ "Angle AC: " + this.angleAC + "\n"
				+ "Angle BD: " + this.angleBD + "\n"
				+ "Side 1 Length: " + this.side1Length + "\n"
				+ "Side 2 Length: " + this.side2Length + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Parallelogram) {
			Parallelogram p = (Parallelogram) obj;
			return super.equals(p) && this.side1Length == p.side1Length && this.side2Length == p.side2Length
					&& this.angleAC == p.angleAC && this.angleBD == p.angleBD;
		}
		return false;
	}
	
	@Override
	public double calcArea() {
		return (this.side1Length * this.side2Length) * Math.sin(Math.toRadians(this.angleBD));
	}

	@Override
	public double calcPerimeter() {
		return (this.side1Length*2) + (this.side2Length*2);
	}

	public double getSide1Length() {
		return side1Length;
	}

	public void setSide1Length(double side1Length) {
		this.side1Length = side1Length;
	}

	public double getSide2Length() {
		return side2Length;
	}

	public void setSide2Length(double side2Length) {
		this.side2Length = side2Length;
	}

	public void setAngles(double angleAC, double angleBD) {
		this.angleAC = angleAC;
		this.angleBD = angleBD;
	}
	
	public double getAngleAC() {
		return angleAC;
	}

	public double getAngleBD() {
		return angleBD;
	}	

}
