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
			String name;
			int score;
			switch(menuChoice) {
			case A:
				System.out.println("Enter the player's name you want to add: ");
				name = in.nextLine();
				System.out.println("Enter the player's score: ");
				score = in.nextInt();
				in.nextLine();
				highScores.addPlayer(name, score);
				break;
			case B:
				System.out.println(highScores.toString());
				break;
			case C:
				System.out.println("Enter the player's name you want to find: ");
				name = in.nextLine();
				Name nameObj = new Name(name);
				score = highScores.findPlayerScore(nameObj);
				if(score >= 0) {
					System.out.println("The score of " + name + ": " + score);
				}
				else {
					System.out.println("Sorry the player, you are searching for does not exist!");
				}
				System.out.println();
				break;
			case D:
				System.out.println("Enter the player's name you want to remove: ");
				name = in.nextLine();
				highScores.removePlayer(name);
				break;
			case E: 
				System.out.println("Thank-you for using our high score application! Good-bye.!");
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
