package q3;
/**
 * Class used to represent a movie
 * @author 
 * @since 
 */
public class Movie{
	
	public static enum RatingSystem {G, PG, PG_13, R, NC_17}; //MPAA  movie ratings
	
	protected int idNumber; //movie id number
	protected String title; //movie title
	protected RatingSystem rating; //movie rating
	
	/**
	 * Three argument constructor
	 * @param idNumber ID Number of the Movie
	 * @param title Title of the Movie
	 * @param rating MPAA rating of the Movie
	 */
	public Movie(int idNumber, String title, RatingSystem rating) {
		this.idNumber = idNumber;
		this.title = title;
		this.rating = rating;
	}
	
	/**
	 * Copy constructor
	 * @param movieToCopy The Movie object you wish to copy
	 */
	public Movie(Movie movieToCopy){
		this(movieToCopy.idNumber, movieToCopy.title, movieToCopy.rating); //calls the three argument constructor
	}
	
	/**
	 * Calculate DEFAULT late fees given the number of days late
	 * @param Number of days the Movie is late
	 * @return Double value representing the amount of late fees owed
	 */
	public double calcLateFees(int daysLate) {
		return daysLate * 2.00;
	}
	
	/**
	 * equals method. Returns true if both movies 
	 * have the same ID number.
	 * @param obj Object you would like to compare to this Movie
	 * @return true if both objects are movies having the same ID number, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Movie) {
			Movie m = (Movie) obj;
			if(this.idNumber == m.idNumber) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * toString method.
	 * @return String containing movie title, id number, and rating
	 */
	@Override
	public String toString() {
		return "Movie Title: " + title + "\\nID Number: " + idNumber + "\nRating: " + rating;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public RatingSystem getRating() {
		return rating;
	}

	public void setRating(RatingSystem rating) {
		this.rating = rating;
	}
}
