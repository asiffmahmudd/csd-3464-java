package q3;

public class Drama extends Movie{

	public Drama(int idNumber, String title, RatingSystem rating) {
		super(idNumber, title, rating);
	}

	public double calcLateFees(int daysLate) {
		return daysLate * 2.00;
	}
	
}
