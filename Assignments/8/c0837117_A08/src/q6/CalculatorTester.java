package q6;
import java.util.*;
import java.math.BigDecimal;

public class CalculatorTester {

	public static void main(String[] args) {
		
		//To get you started :-)
		Calculator calc = new Calculator(); //calculator with defualt value 0
		Scanner scan = new Scanner(System.in);
		
		char userConsent = 'y';
		char operator = 'a';
		BigDecimal numericValue = BigDecimal.ZERO;
		String userInput = "";
		String dividedInput[];
		
		System.out.println("Calculator is on.");
		do{
			calc.result = BigDecimal.ZERO;
			System.out.println("result is = " + calc);
			
			
			while(userInput.toLowerCase() != "r") {
				userInput = scan.nextLine();
				if(userInput.toLowerCase().equals("r")) {
					break;
				}
				dividedInput = userInput.split(" ");

				if(dividedInput.length == 2) {

					if(dividedInput[0].length() == 1) {
						try {
							operator = dividedInput[0].charAt(0);
							numericValue = new BigDecimal(dividedInput[1]);
							calc.performOperation(operator, numericValue);
							System.out.println("result " + operator + " " + numericValue + " = " + calc.result);
							System.out.println("new result = " + calc.result);
						}
						catch(NumberFormatException exc){
							System.out.println("NumberFormatException: Value " + dividedInput[1] + " is not numeric");
							System.out.println("result = " + calc.result);
						}
						catch(ArithmeticException exc){
							System.out.println("ArithmeticException: Cannot divide by zero");
							System.out.println("result = " + calc.result);
						}
						catch(UnknownOperatorException exc){
							System.out.println(exc.getMessage());
							System.out.println("result = " + calc.result);
						}
					}
					else {
						System.out.println("Invalid operator");
					}
				}
				else {
					System.out.println("Invalid number of inputs");
				}
					
			}	
			
			System.out.println("Final result = " + calc);
			System.out.println("Again? (y/n)");
			userInput = scan.nextLine().toLowerCase();
			while(!userInput.equals("y") && !userInput.equals("n") && !userInput.equals("yes") && !userInput.equals("no")) {
				System.out.println("Again? (y/n)");
				userInput = scan.nextLine().toLowerCase();
			}
			userConsent = userInput.charAt(0);
		}
		while(userConsent == 'y');
		System.out.println("End of program.");
	}

}
