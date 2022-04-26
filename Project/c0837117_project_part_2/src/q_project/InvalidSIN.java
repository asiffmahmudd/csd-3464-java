package q_project;

public class InvalidSIN extends Exception{
	public InvalidSIN() {
		super("\nERROR: Invalid SIN number provided");
	}
	
	public InvalidSIN(String msg) {
		super(msg);
	}
}
