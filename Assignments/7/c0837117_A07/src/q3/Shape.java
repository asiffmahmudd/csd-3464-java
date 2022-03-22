package q3;

/**
 * Abstract class used to represent geometric shapes
 * @author Aaron Sarson
 */
public abstract class Shape {
	
	/* Centre coordinate of Shape on a 2D plane specified as (x, y) coordinate*/
	protected double xCoordinate;
	protected double yCoordinate;
	
	/**
	 * Two argument consturctor that sets centre coordinate of Shape
	 * @param x Centre x coordinate on a 2D plane
	 * @param y Centre y coordinate on a 2D plane
	 */
	public Shape(double x, double y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	/**
	 * Copy Constructor
	 * @param shapeToCopy Shape to copy
	 */
	public Shape(Shape shapeToCopy) {
		this.xCoordinate = shapeToCopy.xCoordinate;
		this.yCoordinate = shapeToCopy.yCoordinate;
	}
	
	public Shape clone() {
		return this.clone(); //calls the appropriate clone method
	}
	
	/**
	 * Accessor for xCoordinate field
	 * @param x Centre x coordinate on a 2D plane
	 */
	public void setCentreX(double x) {
		this.xCoordinate = x;
	}
	
	/**
	 * Accessor for yCoordinate field
	 * @param x Centre y coordinate on a 2D plane
	 */
	public void setCentreY(double y) {
		this.yCoordinate = y;
	}
	
	@Override
	/**
	 * Override Java.lang.Object's default toString method
	 */
	public String toString() {
		return String.format("Centre Coordinate: (%.2f , %.2f)", 
				this.xCoordinate, this.yCoordinate);
	}
	
	@Override
	/**
	 * Override Java.lang.Object's default to equals method
	 */
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Shape) {
			
			Shape shp1 = this;
			Shape shp2 = (Shape) obj;
			
			return shp1.equals(shp2);
		}
		return false;
	}
	
	/**
	 * Method that calculates the area of "this" geometric Shape
	 * @return Area of geometric Shape
	 */
	public abstract double calcArea();
	
	/**
	 * Method that calculates the perimeter of "this" geometric Shape
	 * @return Area of geometric Shape
	 */
	public abstract double calcPerimeter();
	
	
	
}
