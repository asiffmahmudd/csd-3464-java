package q3;

public class Rental {
	protected Movie movie;
	protected int customerID;
	protected int numDaysLate;


	public Rental(Movie movie, int customerID, int numDaysLate) {
		super();
		this.movie = movie;
		this.customerID = customerID;
		this.numDaysLate = numDaysLate;
	}

	public Rental(Rental rentToCopy) {
		this.movie = new Movie(rentToCopy.movie);
		this.customerID = rentToCopy.customerID;
		this.numDaysLate = rentToCopy.numDaysLate;
	}
	
	public double calcLateFees() {
		return  this.movie.calcLateFees(numDaysLate);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getNumDaysLate() {
		return numDaysLate;
	}

	public void setNumDaysLate(int numDaysLate) {
		this.numDaysLate = numDaysLate;
	}
}
