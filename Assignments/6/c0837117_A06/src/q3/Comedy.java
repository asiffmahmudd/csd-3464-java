package q3;

public class Comedy extends Movie{

	public Comedy(int idNumber, String title, RatingSystem rating) {
		super(idNumber, title, rating);
	}
	
	public double calcLateFees(int daysLate) {
		return daysLate * 2.50;
	}
}
