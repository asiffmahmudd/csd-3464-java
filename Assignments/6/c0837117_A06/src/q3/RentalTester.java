package q3;

public class RentalTester {

	/*  Follow the instructions in the assignment 05 PDF document
	 *  to generate the required Movie, Rental objects, and array 
	 *  of Rental objects as directed.
	 */
	 
	public static void main(String[] args) {
		Action a = new Action(12345, "John Wick", Movie.RatingSystem.R);
		Comedy c = new Comedy(3333, "21 Jump Street", Movie.RatingSystem.PG_13);
		Drama d = new Drama(6789, "Spot Light", Movie.RatingSystem.R);
		
		Rental actionRental = new Rental(a, 111, 2);
		Rental comedyRental = new Rental(c, 111, 3);
		Rental dramaRental = new Rental(d, 111, 1);
		
		Rental[] r = new Rental[3];
		r[0] = actionRental;
		r[1] = comedyRental;
		r[2] = dramaRental;
		
		lateFeesOwed(r);
	}
	
	/**
	 * Iterates through array of Rental objects and returns
	 * the total amount of late fees that are outstanding.
	 * @param rentals Array of Rental objects
	 * @return Total of late fees for all Rental objects in array
	 */
	public static double lateFeesOwed(Rental[] rentals) {
		int arr_len = rentals.length;
		double lateFees = 0;
		
		for(int i = 0; i < arr_len; i++) {
			lateFees += rentals[i].calcLateFees();
		}
		
		System.out.println("Total late fees: " + lateFees);
		
		return 0; 
	}

}
