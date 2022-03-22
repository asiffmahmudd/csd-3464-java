package q21;

public class HighScoreList {
	
	public static int MAX_PLAYERS = 10;
	private Player scoreList[]; 
	private int numPlayers; //number of players currently in the array (should be between 0-10)
	
	/**
	 * No argument constructor
	 * Creates an array Player of size MAX_PLAYERS
	 * Set number of players to 0 initially as list starts empty
	 */
	public HighScoreList() {
		this.scoreList = new Player[MAX_PLAYERS];
		this.numPlayers = 0;
	}
	
	/**
	 * Add a new Player to the HighScoreList with specified name and score.
	 * The new Player should be inserted into the correct index so that Player's 
	 * are in sorted ordered with highest score Player's appearing first
	 *
	 * IMPORTANT: If the Player's score is too low the Player will not be added
	 * to the scoreList array
	 * 
	 * @param name Player's name which you wish to add
	 * @param score Player's score which you wish to add
	 */
	public void addPlayer(String name, int score) {
		//TODO: implement the addPlayer() method
	}
	
	/**
	 * Remove the Player from scoreList based on their name.
	 * HINT: Use Name's equals() method 
	 * @param name Player's name
	 */
	public void removePlayer(String name) {
		//TODO: implement the removePlayer() method
	}
	
	/**
	 * Find player score from the list based on their name.
	 * If no player exists matching given name return -1.
	 * HINT: Use Name's equals() method 
	 * @param name Player's name
	 */
	public int findPlayerScore(Name name) {
		return -1;//TODO: implement the findPlayerScore() method
	}
	
	/**
	 * Return a boolean value indicating if the scoreList is empty;
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return numPlayers <= 0;
	}
	
	/**
	 * Returns a boolean value indicating if the scoreList is full;
	 * @return true if list is full, false otherwise
	 */
	public boolean isFull() {
		return numPlayers >= MAX_PLAYERS;
	}
	
	/**
	 * Return a String with one players name and score per line
	 * from the scoreList.
	 */
	public String toString() {
		return ""; //TODO: implement the toString() method
	}
	
	
}
