package q8;

/**
 * <h1> Assignment 01 – Q8 (Cryptarithmetic) </h1>
 * A class used to the solution of particular cryptarithemtic equation
 * @author C0837117 – Asif Mahmud
 * @since 2022-01-28
 */


public class Cryptarithmetic {

	public static void main(String[] args) {
		int minValue = 0, maxValue = 9; // initializing variables
		int TOO = 0, GOOD = 0, leftHandSide = 0, rightHandSide = 0, found = 0; // initializing variables
		int T = 0, O = 0, G= 0, D = 0; // initializing variables
		int resultT = 0, resultO = 0, resultG = 0, resultD = 0; // initializing variables
		
		for(T = minValue; T <= maxValue && found == 0; T++) {  // loop for T and checking if a solution has been found
			for(O = minValue; O <= maxValue && found == 0; O++) { // loop for O and checking if a solution has been found
				if(T != O) { // checking if it's unique
					for(G = minValue; G <= maxValue && found == 0; G++) { // loop for G and checking if a solution has been found
						if(G != O && G != T) { // checking if it's unique
							for(D = minValue; D <= maxValue && found == 0; D++) {
								if(D != G && D != O && D != T) { // checking if it's unique
									TOO = Integer.valueOf(String.valueOf(T)+String.valueOf(O)+String.valueOf(O)); // finding the value of TOO
									GOOD = Integer.valueOf(String.valueOf(G)+String.valueOf(O)+String.valueOf(O)+String.valueOf(D)); // finding the value of GOOD
									leftHandSide = TOO + TOO + TOO + TOO; // calculating left hand side of the equation
									rightHandSide = GOOD; // calculating the right hand side of the equation
									if(leftHandSide == rightHandSide) { // checking if both sides are same
										found = 1;    // if a match is found, changing the flag variable
										resultT = T;  // storing the result for T
										resultO = O;  // storing the result for O
										resultG = G;  // storing the result for G
										resultD = D;  // storing the result for D
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("The solution to the puzzle is T: " + resultT + ", O: " + resultO + ", G: " + resultG + ", D: " + resultD); // showing output
		System.out.println("TOO: " + TOO + ", GOOD: " + GOOD); // showing output
	}

}
