package q14;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;

public class ConsecutiveVowels {
	public static void main(String[] args) {
		try {
			File myObj = new File("data.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
	    }
	}	
}