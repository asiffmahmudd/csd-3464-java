package q6;

import java.math.BigDecimal;

/* Class used to represent a calculator */
public class Calculator {
	
	BigDecimal result;
	
	/**
	 * No argument constructor that sets a default starting value of 0
	 */
	public Calculator() {
		result = new BigDecimal("0");
	}
	
	/**
	 * One argument constructor that takes the starting value as a BigDecimal
	 * @param startingValue The starting value for the calculator
	 */
	public Calculator(BigDecimal startingValue){
		result = startingValue; 
	}
	
	/**
	 * Updates the "result" field to be its original value plus "valueToAdd"
	 * @param valueToAdd Numeric value to add to calculator total
	 */
	private void add(BigDecimal valueToAdd) {
		this.result = this.result.add(valueToAdd);
	}
	
	/**
	 * Updates the "result" field to be its original value minus "valueToSubtract"
	 * @param valueToSubtract Numeric value to subtract from the calculator total
	 */
	private void subtract(BigDecimal valueToSubtract){
		this.result = this.result.subtract(valueToSubtract);
	}
	
	/**
	 * Updates the "result" field to be its original value multiplied by the "valueToMultiplyBy"
	 * @param valueToMultiplyBy Numeric value to multiply the calculator total by
	 */
	private void multiply(BigDecimal valueToMultiplyBy){
		this.result = this.result.multiply(valueToMultiplyBy);
	}
	
	/**
	 * Updates the "result" field to be its original value divided by the "valueToDivideBy"
	 * @param valueToDivideBy Numeric value to divide the calculator total by
	 * @throws ArithmeticException Divide by zero error
	 */
	private void divide(BigDecimal valueToDivideBy) throws ArithmeticException{
		if(valueToDivideBy.equals(BigDecimal.ZERO)) {
			throw new ArithmeticException("Divide by zero not permitted");
		}
		else {
			this.result = this.result.divide(valueToDivideBy);
		}
	}
	
	/**
	 * Performs the correct operation given a specified operator and numeric value
	 * @param operator Single Character for operator
	 * @param numericValue Numeric value which to apply the operator on
	 */
	public void performOperation(char operator, BigDecimal numericValue) 
		throws UnknownOperatorException, ArithmeticException {
		//checking operator
		if(operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			//calling appropriate method for operator
			switch(operator) {
				case '+':
					this.add(numericValue);
					break;
				case '-':
					this.subtract(numericValue);
					break;
				case '*':
					this.multiply(numericValue);
					break;
				case '/':
					this.divide(numericValue);
					break;
			}
		}
		//throwing error in case it's an invalid operator
		else {
			throw new UnknownOperatorException();
		}
	}
	
	@Override
	public String toString() {
		//Returns the calculator value with no trailing zeros
		return result.stripTrailingZeros().toPlainString();
	}

}
