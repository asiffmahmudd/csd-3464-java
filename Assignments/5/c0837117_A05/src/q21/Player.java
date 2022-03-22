package q21;

/**
 * Class used to represent a player
 * @author Aaron Sarson
 * @since 2020-02-07
 * @version 1.0.0
 */
public class Player {
	private Name name;
	private int score;
	
	/**
	 * Two argument constructor
	 * @param name Full name of player as a String
	 * @param score Integer score of player
	 */
	public Player(String name, int score) {
		this.name = new Name(name);
		this.score = score;
	}
	
	/**
	 * Copy constructor
	 * @param player Player object to copy
	 */
	public Player(Player player) {
		this.name = new Name(player.name);
		this.score = player.score;
	}
	
	/**
	 * Display String in format "Name: <Last, First> Score: <score>" or
	 * "Name: <Last, First, MiddleInitial.> Score: <score>" if player has
	 * a middle name
	 * @return String including player's name and score
	 */
	public String toString() {
		return "Name: " + name.toString() + " Score: " + this.score + "\n";
	}
	
	/**
	 * Set player's score
	 * @param score Player's score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * Return player's score
	 * @return Player's score
	 */
	public int getScore() {
		return this.score;
	}
	
	/**
	 * Set player's name
	 * @param name Player's full name
	 */
	public void setName(String name) {
		String[] parts = name.split("\\s+"); //split name on spaces
		
		if(parts.length == 2) {
			this.name.setName(parts[0], parts[1]); //set first and last name (middle name is set to null)
		} else if (parts.length == 3) {
			this.name.setName(parts[0], parts[1], parts[2]); //set first, middle, and last name
		}
	}
	
	/**
	 * Return Player's name object
	 * @return Player's name
	 */
	public Name getName() {
		return new Name(this.name); //return copy of name 
	}
	
	/**
	 * Compare if two Player objects are equivalent.
	 * @param o Any object
	 * @return true if players have same name, false otherwise
	 */
	public boolean equals(Object o) {
		if(o instanceof Player) {
			Player player = (Player) o; //cast Object to Player
			
			/* Players must have same name to be equivalent */
			return this.name.equals(player.getName());
		}
		return false;
	}
	

}
