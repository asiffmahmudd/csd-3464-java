package q9;

/**
 * <h1> Assignment 01 – Q9 (FractionDemo) </h1>
 * A class used to calculate the marks and total marks of some exercises
 * @author C0837117 – Asif Mahmud
 * @since 2022-01-28
 */

import java.util.*;

public class CalculateScore {
	
	public static int getInput() { // method for getting input
		Scanner scan = new Scanner(System.in);
		boolean isValid = false; // flag variable for validation
		int input = 0;
		while(!isValid) {
			try {
				input = scan.nextInt();
				isValid = true;
			}
			catch(Exception e) {
				System.out.println("Invalid input! Please Try again");
				scan.next();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		System.out.println("How many exercises to input? ");
		int numberOfExercises = getInput();
		
		int totalObtainedMark = 0, totalTestMark = 0;
		for(int i = 1; i <= numberOfExercises; i++) {
			System.out.println("Score received for exercise "+i+": ");
			totalObtainedMark += getInput(); // adding and keeping track of total obtained marks
			System.out.println("Total points possible for exercise "+i+": ");
			totalTestMark += getInput(); // adding and keeping track of total test marks
		}
		double percentage = totalObtainedMark*100.00/totalTestMark;
		System.out.println("Your total is " + totalObtainedMark + " out of " + totalTestMark 
				+ ", or " + String.format("%.2f", percentage) + "%.");
	}

}
