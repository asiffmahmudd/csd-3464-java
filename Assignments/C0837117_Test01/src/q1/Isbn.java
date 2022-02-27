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
		
	}
	
	public Isbn(String prefix, String resgistrationGroup, String registrant, String publication, String checkDigit,
			String seperator) {
		super();
		this.prefix = prefix;
		this.resgistrationGroup = resgistrationGroup;
		this.registrant = registrant;
		this.publication = publication;
		this.checkDigit = checkDigit;
		this.seperator = seperator;
	}

	public Isbn(Isbn isbn) {
		
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
		System.out.println(seperator+" " + count);
		if(count != 4) { // checking the count value
			return false;
		}
		
		StringTokenizer strToken = new StringTokenizer(isbn, String.valueOf(seperator));
		count = 0;
		while(strToken.hasMoreTokens() && count <= 3) {
			System.out.println(strToken.nextToken());
			count++;
		}
		return false;
	}
	
}
