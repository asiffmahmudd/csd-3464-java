package q8;

public class Cryptarithmetic {

	public static void main(String[] args) {
		int minValue = 0, maxValue = 9;
		String word1 = "TOO";
		String word2 = "GOOD";
		String sentence[] = (word1+word2).split(""); 
		String letters = "";
		for (String letter: sentence) {
			if(!letters.contains(letter)) {
				letters += letter;
			}
		}
		for(int i = minValue; i <= maxValue; i++) {
			
		}
	}

}
