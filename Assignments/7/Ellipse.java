package q6;

/**
 * Class used to represent the Ellipse geometric shape
 * @author Aaron Sarson
 */
public class Ellipse extends Shape {
	
	/*ellipse shapes (i.e. ovals) have a major and minor axis */
	protected double majorAxis;
	protected double minorAxis;

	/**
	 * Four argument constructor for Ellipse/Oval
	 * @param x Centre x coordinate on a 2D plane
	 * @param y Centre y coordinate on a 2D plane
	 * @param majorAxis Longest distance from centre to ellipse perimeter
	 * @param minorAxis Shortest distance from centre to ellipse perimeter
	 */
	public Ellipse(double x, double y, double majorAxis, double minorAxis) {
		super(x, y); //calls Shape's two argument constructor
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}
	
	/**
	 * Copy Constructor
	 * @param elp Ellipse Object to copy
	 */
	public Ellipse(Ellipse elp) {
		super(elp);
		this.majorAxis = elp.majorAxis;
		this.minorAxis = elp.minorAxis;
	}
	
	@Override
	public Ellipse clone() {
		return new Ellipse(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Ellipse) {
			Ellipse elp = (Ellipse) obj;
			return super.equals(elp) && this.majorAxis == elp.majorAxis &&
					this.minorAxis == elp.minorAxis;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%nMajor Axis: %f%nMinor Axis: %f", this.majorAxis, this.minorAxis);
				
	}
	
	/**
	 * Mutator for majorAxis field
	 * @param majorAxis Longest distance from centre to ellipse perimeter
	 */
	public void setMajorAxis(double majorAxis) {
		this.majorAxis = majorAxis;
	}
	
	/**
	 * Accessor for majorAxis field
	 * @return Longest distance from centre to ellipse perimeter
	 */
	public double getMajorAxis() {
		return this.majorAxis;
	}
	
	/**
	 * Mutator for minorAxis field
	 * @param minorAxis Shortest distance from centre to ellipse perimeter
	 */
	public void setMinorAxis(double minorAxis) {
		this.minorAxis = minorAxis;
	}
	
	/**
	 * Accessor for minorAxis
	 * @return Shortest distance from centre to ellipse perimeter
	 */
	public double getMinorAxis() {
		return this.minorAxis;
	}
	

	@Override
	/**
	 * Formula to calculate area of ellipse/oval
	 */
	public double calcArea() {
		return Math.PI * this.majorAxis * this.minorAxis;
	}

	@Override
	/**
	 * Ramanujan's ellipse circumference approximation formula.
	 * See link: https://www.mathsisfun.com/geometry/ellipse-perimeter.html
	 */
	public double calcPerimeter() {
		double h = Math.pow(this.majorAxis - this.minorAxis, 2) / Math.pow(this.majorAxis + this.minorAxis, 2);
		double p = Math.PI * (this.majorAxis + this.minorAxis) * 
				( 1 + ( (3 * h) / (10 + Math.sqrt(4 - 3 * h)) ) );
		return p;
	}

}
