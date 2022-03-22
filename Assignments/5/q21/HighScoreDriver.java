package q21;

import java.util.Scanner;

public class HighScoreDriver {
	
	static Scanner in = new Scanner(System.in); //open keyboard scanner -> you can use this throughout this class
	
	enum MenuOption { A, B, C, D, E}; //user can select options 'A', 'B', 'C', 'D', 'E'

	public static void main(String[] args) {

		MenuOption menuChoice = null;
        HighScoreList highScores = new HighScoreList(); 
        
		do {
			menuChoice = getMenuChoice(); //displays and gets valid menu selection
			
			switch(menuChoice) {
			case A:
				//TODO: write statements to add a new player to high score list
				break;
			case B:
				//TODO: Display player names and their scores
				break;
			case C:
				//TODO: Find the players score, if no matching player display error message
				break;
			case D:
				//TODO: Remove specified player from the list, if they exist
				break;
			case E: 
				//TODO: Display an exit message, indicating end of the program
				break;
			}
			
		}while(menuChoice != MenuOption.E); //'E' will exit the program 

		in.close(); //close scanner
	}
	
	/**
	 * Print menu to the console
	 */
	public static void printMenu() {
		System.out.println("*****************\n"
				+ "      MENU\n"
				+ "*****************\n"
				+ "a. Add a new player and score (up to 10 players)\n"
				+ "b. Print all player's names and their scores to the screen\n"
				+ "c. Find player's score given player name\n"
				+ "d. Remove player from high score list given their name\n"
				+ "e. Exit application\n");
	}
	
	/**
	 * Allow the user to make a menu choice 
	 * If an invalid selection is made continue to re-prompt the user for valid input
	 * @return A valid menu choice
	 */
	public static MenuOption getMenuChoice() {
		MenuOption choice = null;
		String selection = "";
		boolean validInput = true;
		
		do {
			printMenu();
			System.out.println("Please enter your menu selection: ");
			selection = in.nextLine();
			selection= selection.toUpperCase(); //convert to uppercase
			
			try {
				choice = MenuOption.valueOf(selection);
				validInput = true;
			} catch (Exception e) { //If input is not valid, change validInput flag to false
				System.out.println("ERROR: Please select a valid menu choice!\n\n");
				validInput = false;
			}
			
		} while(!validInput); //keep looping until validInput selection is made
		
		return choice;
	}
}
