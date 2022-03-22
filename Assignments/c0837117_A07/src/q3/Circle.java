package q3;

/**
 * Circle is a special case Ellipse where the majorAxis = minorAxis
 * @author Aaron Sarson
 *
 */
public class Circle extends Ellipse {

	public Circle(double x, double y, double radius) {
		
		/* Major and minor axis of Ellipse are the same for a circle, 
		   to this as the radius of the Circle */
		super(x, y, radius, radius); 
	}
	
	/**
	 * Copy constructor
	 * @param crl Circle Object to copy
	 */
	public Circle(Circle crl) {
		super(crl); //call Ellipse copy constructor
	}
	
	@Override
	public Circle clone() {
		return new Circle(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Circle) {
			Ellipse crl = (Circle) obj;
			return super.equals(crl); //calls Ellipse equals method
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("Centre Coordinate: (%.2f , %.2f)%nRadius: %.2f", 
				this.xCoordinate, this.yCoordinate, this.majorAxis);
	}
	
	/**
	 * Accessor for radius
	 * @return Return radius of circle
	 */
	public double getRaidus() {
		return this.majorAxis; 
	}
	
	/**
	 * Mutator for radius
	 * @return Set radius of circle
	 */
	public void setRaidus(double radius) {
		this.majorAxis = radius; 
		this.minorAxis = radius; 
	}
	
	@Override
	/**
	 * Mutator for majorAxis field
	 * @param majorAxis Longest distance from centre to ellipse perimeter
	 */
	public void setMajorAxis(double radius) {
		this.setRaidus(radius);
	}
	
	@Override
	/**
	 * Mutator for minorAxis field
	 * @param minorAxis Shortest distance from centre to ellipse perimeter
	 */
	public void setMinorAxis(double radius) {
		this.setRaidus(radius);
	}

}
