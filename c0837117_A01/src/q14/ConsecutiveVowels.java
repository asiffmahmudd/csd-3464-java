package q14;
import java.io.*;
import java.util.*;

/**
 * <h1> Assignment 01 – Q14 (Consecutive vowels) </h1>
 * A class used to find the word with most consecutive vowels
 * @author C0837117 – Asif Mahmud
 * @since 2022-01-28
 */

public class ConsecutiveVowels {
	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("data.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
	    }
		String result = "";
		int maxVowels = 0;
		int currentConsecutiveVowels = 0, maxConsecutiveVowels = 0;
		while (fileIn.hasNextLine()) { // reading next word from file
			String word = fileIn.nextLine();
			char data[] = word.toLowerCase().toCharArray(); //converting the word to a character array
			currentConsecutiveVowels = 0;
			maxConsecutiveVowels = 0;
			
			for(int i = 0; i < data.length; i++) {  // loop for checking each character
				if(data[i] == 'a' || data[i] == 'e' || data[i] == 'i' || data[i] == 'o' || data[i] == 'u' ) {
					currentConsecutiveVowels++;
				}
				else {
					if(maxConsecutiveVowels < currentConsecutiveVowels) {
						maxConsecutiveVowels = currentConsecutiveVowels;
					}
					currentConsecutiveVowels = 0;
				}
			}
			
			if(maxConsecutiveVowels < currentConsecutiveVowels) { // this condition if a sequence has vowels in the end or if entirely consists of vowels
				maxConsecutiveVowels = currentConsecutiveVowels;
			}
			if(maxVowels < maxConsecutiveVowels) { // checking if there's another word with more consecutive vowels
				maxVowels = maxConsecutiveVowels;
				result = word;
			}
		}
		System.out.println(result);
	}	
}
