package q3;

public class Action extends Movie{

	public Action(int idNumber, String title, RatingSystem rating) {
		super(idNumber, title, rating);
	}
	
	public double calcLateFees(int daysLate) {
		return daysLate * 3.00;
	}
	
}
