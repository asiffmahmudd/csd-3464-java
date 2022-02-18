/**
 * Class used to represent a person's name
 * @author Asif Mahmud
 * @since 2022-02-17
 * @version 1.0.0
 */
public class Name {
	
	/* instance variables */
	public String first;
	public String middle;
	public String last;
	
	/**
	 * One parameter constructor that takes a single String of person's full name
	 * separated by spaces
	 * @param name person's name in the format "first last" or "first middle last"
	 */
	public Name(String name) {
		
		String[] parts = name.split("\\s+"); //splits the String name on any one or more space characters
		
		if(parts.length == 2) {
			this.setName(parts[0], parts[1]); //set first and last name (middle name is set to null)
		} else if (parts.length == 3) {
			this.setName(parts[0], parts[1], parts[2]); //set first, middle, and last name
		}
	}
	
	/**
	 * Copy constructor
	 * @param name Name object which to perform a deep copy on
	 */
	public Name(Name name) {
		setName(name.first, name.middle, name.last);
	}
	
	/**
	 * Set person's first, middle, and last name
	 * @param first person's first name
	 * @param middle person's middle name
	 * @param last person's last name
	 */
	public void setName(String first, String middle, String last) {
		setFirstName(first);
		setMiddleName(middle);
		setLastName(last);
	}
	
	/**
	 * Set person's first and last name.
	 * Middle name is set to null.
	 * @param first person's first name
	 * @param last person's last name
	 */
	public void setName(String first, String last) {
		setName(first, null, last); //no middle name
	}
	
	/**
	 * Set first name
	 * @param first person's first name
	 */
	public void setFirstName(String first) {
		this.first = convertToProperCase(first);
	}
	
	/**
	 * Return first name
	 * @return first name
	 */
	public String getFirstName() {
		return this.first;
	}
	
	/**
	 * Set middle name
	 * @param middle person's middle name
	 */
	public void setMiddleName(String middle) {
		this.middle = (middle != null) ? convertToProperCase(middle) : null;
	}
	
	/**
	 * Return middle name
	 * @return middle name
	 */
	public String getMiddlName() {
		return this.middle;
	}
	
	/**
	 * Set last name
	 * @param last person's middle name
	 */
	public void setLastName(String last) {
		this.last = convertToProperCase(last);
	}
	
	/**
	 * Return last name
	 * @return last name
	 */
	public String getLastName() {
		return this.last;
	}
	
	/**
	 * Compare if two Name objects are equivalent.
	 * @param o Any object
	 * @return true if first, middle, and last name are the same, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Name) {
			Name nameObj = (Name) o; //cast Object to Name
			boolean middleCheck;
			
			if(middle == null && nameObj.middle == null) //both middle names are null
				middleCheck = true;
			else if (middle == null || nameObj.middle == null) //one middle name is null and the other is not
				middleCheck = false;
			else //compare character sequence to see if names are the same
				middleCheck = middle.equals(nameObj.middle);
			
			
			return first.equals(nameObj.first) && middleCheck
					 && last.equals(nameObj.last);
		}
		return false;
	}
	
	/**
	 * Return String in format "last, first middleInitial." if middle initial exists. 
	 * Otherwise, return String in format "last, first"
	 * @return String representing person's name
	 */
	@Override
	public String toString() {
		String middleInital = (this.middle == null) ? "" : " "  + this.middle.charAt(0) + ".";
		return this.last + ", " + this.first + middleInital;
	}
	
	/**
	 * Convert provided String so first letter is uppercase and any 
	 * subsequent letters are lowercase 
	 * @param word A String
	 * @return Word with starting uppercase followed by lower case
	 */
	private String convertToProperCase(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}
	
}
