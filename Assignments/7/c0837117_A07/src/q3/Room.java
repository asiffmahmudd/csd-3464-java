package q3;

public class Room {
	
	private String name; //name of room
	private Shape shape; //geometric shape of room
	
	/**
	 * Two argument constructor
	 * @param name Name of Room
	 * @param shape Geometric Shape of Room
	 */
	public Room(String name, Shape shape) {
		this.name = name;
		this.shape = shape;
	}
	
	/**
	 * Copy Constructor
	 * @param roomToCopy Room to Copy
	 */
	public Room(Room roomToCopy) {
		this.name = roomToCopy.name;
		this.shape = roomToCopy.shape.clone();
	}
	
	@Override
	public Room clone() {
		return new Room(this);
	}
	
	@Override
	public String toString() {
		return String.format("Room: %s%n", name) + shape;
	}
	
	public double getArea() {
		return shape.calcArea(); //calls the correct calcArea method based on Shape type
	}
	
	public double getPerimeter() {
		return shape.calcPerimeter(); //calls the correct calcArea method based on Shape type
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape.clone(); //returns a copy of shape
	}
}
