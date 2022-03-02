package q1;
import java.util.*;

public class Isbn {
	private String prefix;
	private String resgistrationGroup;
	private String registrant;
	private String publication;
	private String checkDigit;
	private String seperator;
	
	public Isbn(String isbn) {
		if(isValidISBN(isbn)) {
			if(isbn.indexOf('-') >= 0) { // checking the seperator value
				this.seperator = "-";
			}
			else {
				this.seperator = " ";
			}
			StringTokenizer strToken = new StringTokenizer(isbn, String.valueOf(seperator));
			int count = 0;
			while(strToken.hasMoreTokens()) { //loop for assigning the value to the corresponding variable
				switch(count) {
					case 0: 
						this.prefix = strToken.nextToken();
						break;
					case 1:
						this.resgistrationGroup = strToken.nextToken();
						break;
					case 2:
						this.registrant = strToken.nextToken();
						break;
					case 3:
						this.publication = strToken.nextToken();
						break;
					case 4:
						this.checkDigit = strToken.nextToken();
						break;
				}
				count++;
			}
		}
		else {
			System.out.println("Invalid isbn!");
			System.exit(0);
		}
	}
	
	public Isbn(String prefix, String resgistrationGroup, String registrant, String publication, String checkDigit,
			String seperator) {
		String isbn = prefix + seperator + resgistrationGroup + seperator + registrant + seperator + 
				publication + seperator + checkDigit; // creating the string for checking the validity
		if(isValidISBN(isbn)) {
			StringTokenizer strToken = new StringTokenizer(isbn, String.valueOf(seperator));
			this.seperator = seperator; // assigning the seperator
			int count = 0;
			while(strToken.hasMoreTokens()) { //loop for assigning the value to the corresponding variable
				switch(count) {
					case 0: 
						this.prefix = strToken.nextToken();
						break;
					case 1:
						this.resgistrationGroup = strToken.nextToken();
						break;
					case 2:
						this.registrant = strToken.nextToken();
						break;
					case 3:
						this.publication = strToken.nextToken();
						break;
					case 4:
						this.checkDigit = strToken.nextToken();
						break;
				}
				count++;
			}
		}
		else {
			System.out.println("Invalid isbn!");
			System.exit(0);
		}
	}

	public Isbn(Isbn isbn) {
		this.prefix = isbn.prefix;
		this.resgistrationGroup = isbn.resgistrationGroup;
		this.registrant = isbn.registrant;
		this.publication = isbn.publication;
		this.checkDigit = isbn.checkDigit;
		this.seperator = isbn.seperator;
	}
	
	public static boolean isValidISBN(String isbn) {
		int isbnLength = isbn.length(); // storing length of the string in a variable
		if(isbnLength != 17) { // checking validity by length
			return false;
		}
		
		char seperator = ' ';
		if(isbn.indexOf('-') >= 0) { // checking the seperator value
			seperator = '-';
		}
		int count = 0; //count variable for counting the seperator
		for(int i = 0; i < isbnLength; i++) { // loop for iterating over the isbn string
			if(isbn.charAt(i) == seperator) { // checking the value at index i
				count++; // increasing count value
			}
		}
		if(count != 4) { // checking the count value
			return false;
		}

		StringTokenizer strToken = new StringTokenizer(isbn, String.valueOf(seperator));
		count = 0;
		while(strToken.hasMoreTokens()) {
			String str = strToken.nextToken();
			int strTokenLength = str.length();

			if(!checkIfDigit(str, strTokenLength)) { 
				return false;
			}

			if(count == 0) { // for prefix
				if(strTokenLength != 3) {
					return false;
				}
				if(!str.equals("978") && !str.equals("979")) {
					return false;
				}
			}
			else if(count == 1) { // for registration group
				if(strTokenLength < 1 || strTokenLength > 5) {
					return false;
				}
			}
			else if(count == 2) { // for registrant
				if(strTokenLength < 2 || strTokenLength > 7) {
					return false;
				}
			}
			else if(count == 3) { // for publication
				if(strTokenLength < 1 || strTokenLength > 6) {
					return false;
				}
			}
			else if(count == 4) { // for check digit
				if(strTokenLength != 1) {
					return false;
				}
				if(calculateCheckDigit(isbn) != Integer.parseInt(str)) {
					return false;
				}
			}
			
			count++;
		}
		return true;
	}
	
	//method for calculating check digit
	public static int calculateCheckDigit(String isbn) { 
		int sum = 0;
		for(int i = 0; i < isbn.length(); i++) {
			if(i % 2 == 0) {
				sum += (int)isbn.charAt(i);
			}
			else {
				sum += 3*(int)isbn.charAt(i);
			}
		}
		
		int result = 10 - (sum % 10);
		return result;
	}
	

	//method for checking if every character is a digit or not
	private static boolean checkIfDigit(String str, int strLength) {
		for(int i = 0; i < strLength; i++) {
			if(!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	//method for comapring two Isbn object
	public boolean equals(Isbn isbn) {
		if(this.prefix.equals(isbn.prefix) && this.resgistrationGroup.equals(isbn.resgistrationGroup) && 
		   this.registrant.equals(isbn.registrant) && this.publication.equals(isbn.publication) && this.checkDigit.equals(isbn.checkDigit)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return this.prefix + this.seperator + this.resgistrationGroup + this.seperator + this.registrant + this.seperator + 
				this.publication + this.seperator + this.checkDigit;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		int strLength = prefix.length();
		if(strLength != 3 || !checkIfDigit(prefix, strLength) || (!prefix.equals("978") && !prefix.equals("979"))) {
			System.out.println("Invalid prefix");
		}
		else {
			this.prefix = prefix;
		}
	}

	public String getResgistrationGroup() {
		return resgistrationGroup;
	}

	public void setResgistrationGroup(String resgistrationGroup) {
		int strLength = resgistrationGroup.length();
		if((strLength < 1 || strLength > 5) || !checkIfDigit(resgistrationGroup, strLength)) {
			System.out.println("Invalid resgistrationGroup");
		}
		else {
			this.resgistrationGroup = resgistrationGroup;
		}
	}

	public String getRegistrant() {
		return registrant;
	}

	public void setRegistrant(String registrant) {
		int strLength = registrant.length();
		if((strLength < 2 || strLength > 7) || !checkIfDigit(registrant, strLength)) {
			System.out.println("Invalid registrant");
		}
		else {
			this.registrant = registrant;
		}
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		int strLength = publication.length();
		if((strLength < 1 || strLength > 6) || !checkIfDigit(publication, strLength)) {
			System.out.println("Invalid publication");
		}
		else {
			this.publication = publication;
		}
	}

	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		int strLength = checkDigit.length();
		if(strLength != 1 || !checkIfDigit(checkDigit, strLength)) {
			System.out.println("Invalid checkDigit");
		}
		else {
			this.checkDigit = checkDigit;
		}
	}

	public String getSeperator() {
		return seperator;
	}

	public void setSeperator(String seperator) {
		if(seperator == " " || seperator == "-") {
			this.seperator = seperator;
		}
		else {
			System.out.println("Invalid seperator");
		}
	}
	
	public void setIsbn(String isbn) {
		if(isValidISBN(isbn)) {
			StringTokenizer strToken = new StringTokenizer(isbn, String.valueOf(seperator));
			int count = 0;
			while(strToken.hasMoreTokens()) {
				switch(count) {
					case 0: 
						this.prefix = strToken.nextToken();
						break;
					case 1:
						this.resgistrationGroup = strToken.nextToken();
						break;
					case 2:
						this.registrant = strToken.nextToken();
						break;
					case 3:
						this.publication = strToken.nextToken();
						break;
					case 4:
						this.checkDigit = strToken.nextToken();
						break;
				}
			}
		}
		else {
			System.out.println("Invalid isbn!");
			System.exit(0);
		}
	}
}
