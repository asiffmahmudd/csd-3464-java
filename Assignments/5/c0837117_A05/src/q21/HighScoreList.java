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
		//assigning to the first index
		if(numPlayers == 0) {
			scoreList[numPlayers++] = new Player(name, score);
			return;
		}
		
		// if there's already player in the array then this loop will run
		int i;
		for(i = 0; i < numPlayers; i++) {
			if(score > scoreList[i].getScore()) {
				// shifting all value of the array one step to the right
				for(int j = i+1; j <= numPlayers && j < MAX_PLAYERS; j++) {
					scoreList[j] = scoreList[j-1];
				}
				// assigning new player to the appropriate index
				scoreList[i] = new Player(name, score);
				numPlayers++;
				return;
			}
		}
		// if it's the player with least score it will come here
		scoreList[i] = new Player(name, score);
		numPlayers++;
	}
	
	/**
	 * Remove the Player from scoreList based on their name.
	 * HINT: Use Name's equals() method 
	 * @param name Player's name
	 */
	public void removePlayer(String name) {
		boolean found = false; // flag for detecting mathing name
		
		for(int i = 0; i < numPlayers; i++) {
			if(scoreList[i].getName().equals(new Name(name))) {
				found = true; // changing flag if a matching is found
				
				int j;
				// shifting every object one step to the left
				for(j = i; j < numPlayers; j++) {
					scoreList[j] = scoreList[j+1];
				}
				// changing the value of the last object of the array to null
				scoreList[j] = null;
				numPlayers--;
			}
		}
		if(!found) {
			System.out.println("No such player found!");
		}
		else {
			System.out.println("Player(s) deleted!");
		}
	}
	
	/**
	 * Find player score from the list based on their name.
	 * If no player exists matching given name return -1.
	 * HINT: Use Name's equals() method 
	 * @param name Player's name
	 */
	public int findPlayerScore(Name name) {
		for(int i = 0; i < numPlayers; i++) {
			if(scoreList[i].getName().equals(name)) {
				return scoreList[i].getScore();
			}
		}
		return -1;
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
		String result = "";
		// looping through the array to get the values
		for(int i = 0; i < numPlayers; i++) {
			result += (i+1) + ". Name: " + scoreList[i].getName() + " Score: " + scoreList[i].getScore() + "\n";
		}
		return result;
	}
	
	
}
