package q3;
import java.util.*;
/**
 * <h1> Assignment 01 ? Q3 (Height Estimator) </h1>
 * A class used to find the height of the child based on it's parent's height
 * @author C0837117 ? Asif Mahmud
 * @since 2022-01-28
 */

public class HeightEstimate {

	public static String getGender() { // method for getting gender of the child
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the gender of the child (M/F) or enter -1 to exit: ");
		String gender = scan.nextLine();
		while(!gender.equals("M") && !gender.equals("m") && !gender.equals("F") 
				&& !gender.equals("f") && !gender.equals("-1")) { //validation for only accepting M/m or F/f from user
			System.out.println("Invalid input! Please try again.");
			System.out.println("Please enter the gender of the child (M/F): ");
			gender = scan.nextLine();
		}
		return gender;
	}
	
	public static int getParentHeight(String parent, String unit) { // method for getting height of parents for both inches and feet using one method.
		Scanner scan = new Scanner(System.in);
		boolean isValid = false;
		int input = -1;
		while(!isValid) {
			try {
				System.out.println("Please enter "+ parent +"'s height in "+ unit +": ");
				input = scan.nextInt();
				if(input < 0) { //validation for negative number
					System.out.println("Invalid input! Please Try again");
					continue;
				}
				isValid = true;
			}
			catch(Exception e) { // exception for other invalid inputs
				System.out.println("Invalid input! Please Try again");
				scan.next();
			}
		}
		return input;
	}
	
	public static void calculateAndShowHeight(String gender,int fathersHeightInFeet, 
			int fathersHeightInInches, int mothersHeightInFeet, int mothersHeightInInches) { // method for calculating the height of the child and also showing output
		
		int fathersHeight = fathersHeightInFeet*12 + fathersHeightInInches;
		int mothersHeight = mothersHeightInFeet*12 + mothersHeightInInches;
		double childsHeight = 0;
		
		if(gender.equals("M") || gender.equals("m")) {
			childsHeight = ((mothersHeight * 13/12.00) + fathersHeight) / 2.00;
		}
		else {
			childsHeight = ((fathersHeight * 12/13.00) + mothersHeight) / 2.00;
		}
		childsHeight = Math.round(childsHeight);

		int childsHeightInFeet = (int)childsHeight/12;
		int childsHeightInInches = (int)childsHeight%12;
		
		System.out.println("Childs height in feet: " + childsHeightInFeet);
		System.out.println("Childs height in inches: " + childsHeightInInches);
	}
	
	public static void main(String[] args) {
		String gender = "";
		while(!gender.equals("-1")) {
			gender = getGender();
			if(!gender.equals("-1")) {
				int fathersHeightInFeet = getParentHeight("father", "feet");
				int fathersHeightInInches = getParentHeight("father", "inches");
				int mothersHeightInFeet = getParentHeight("mother", "feet");
				int mothersHeightInInches = getParentHeight("mother", "inches");
				calculateAndShowHeight(gender, fathersHeightInFeet, fathersHeightInInches, 
					mothersHeightInFeet, mothersHeightInInches);
			}
		}
		System.out.println("Thank you for using our application!");
	}
	
}
