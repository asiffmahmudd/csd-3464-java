package q19;
/*
 * Name: Asif Mahmud
 * Assignment: 4
 * ID: C0837117
 * Date: 3/12/2022
 */

import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;
/**
* Class that allows user to play a word game that determines
* all possible words from words.txt that can be constructed
* from a word provided by the user via keyboard
*/
public class WordGame{ 
	/**
	 * Main method used as the program driver
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		String userWord;
		String fileWord;

		// creating the scanner object
		Scanner scan = new Scanner(System.in);
		userWord = scan.nextLine();
		
		System.out.println("******USER WORD******");
		displayHist(userWord);
		
		System.out.println("******FOUND MATCHES******");
		try {
			// opening file
			File myObj = new File("words.txt");
			Scanner reader = new Scanner(myObj);
			
			// going through each line of the file
		    while (reader.hasNextLine()) {
		    	fileWord = reader.nextLine();
		    	if(canBeGeneratedFrom(fileWord, userWord)) {
		    		displayHist(fileWord);
		    	}
		    }
		    
		    //closing file
		    reader.close();
		// catching exception
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	 /**
	 * Generate histogram containing the occurrence of letters A-Z
	 * @param word English word with no spaces or special characters
	 * @return A 26 element array containing histogram of character 
	 * frequency in given word 
	 */
	public static int[] generateHistogram(String word){
		/* Index 0 is A, 1 is B, ... , 25 is Z */
		int[] charHist = new int[26]; 
		 /* Removes any characters that are not alphabetical characters */
		word = word.replaceAll("[^a-zA-Z]", "").toUpperCase(); 
		for(int i = 0; i < word.length(); i++) {
			charHist[word.charAt(i) - 'A'] += 1; //'A' is 65 in ASCII
		}
		return charHist;
	}
	 /**
	* Display histogram representation of provided word
	* @param word Word containing alphabetical characters
	*/
	public static void displayHist(String word){
		int[] histogram = generateHistogram(word);
		
		System.out.print(word.toUpperCase());
		//going through every character
		for(int i = 0; i < histogram.length; i++) {
			// checking if the character exists in the word
			if(histogram[i] > 0) {
				System.out.print(" -> " + (char)('A'+i) + "|" + histogram[i]);
			}
		}
		System.out.println("");
	}
	 /**
	 * Returns the boolean true or false depending on whether word1
	 * can be built from the letters in word2
	 * @param word1 Word you which to construct
	 * @param word2 Word that contains the letters you have available
	 * @return true if word1 can be built from word2, false
	 * otherwise
	 */
	public static boolean canBeGeneratedFrom(String word1, String word2){
		int hist1[] = generateHistogram(word1);
		int hist2[] = generateHistogram(word2);
		
		for(int i = 0; i < hist1.length; i++) {
			if(hist2[i] < hist1[i]) {
				return false;
			}
		}
		return true;
	} 
} 
