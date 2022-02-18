package q2;

public class Fraction {
	private int numerator;
	private int denominator;
	// No Parameter Constructor
	public Fraction()
	{
		this.numerator = 0; // setting numerator
		this.denominator = 1; // setting denominator
		reduce(); // calling the reduce function
	}
	// Two Parameter Constructor
	public Fraction(int num, int den) 
	{
		if(num >= 0) { //testing the value of num
			this.numerator = num; // setting the value of numerator
		}
		else { // invalid value
			this.numerator = 0;
		}
		if(den > 0) { // testing value of den
			this.denominator = den; // setting value of den
		}
		else { // invalid value
			this.denominator = 1; 
		}
		reduce();
	}
	// Mutator - Numerator
	public void setNumerator(int num)
	{
		if(num >= 0) {
			this.numerator = num;
		}
		else {
			this.numerator = 0;
		}
	} 
	// Accessor - Numerator
	public int getNumerator()
	{
		return this.numerator; // returning numerator
	} 
	// Accessor - Denominator
	public void setDenominator(int num)
	{
		if(num > 0) {
			this.denominator = num;
		}
		else {
			this.denominator = 1;
		}
	}
	// Mutator - Denominator
	public int getDenominator()
	{
		return this.denominator; // returning denominator
	}
	//Reduce method
	private void reduce()
	{
		int initial = this.numerator > this.denominator ? denominator : numerator; // setting the initial value for loop
		for(int i = initial; i > 0; i--) {
			if(this.numerator % i == 0 && this.denominator % i == 0) { // if both of them are divisible by i than we can divide them and make them simpler
				setNumerator(this.numerator/i);
				setDenominator(this.denominator/i);
			}
		}
	}
	// toString method
	@Override
	public String toString()
	{
		return numerator+"/"+denominator; // returning the string
	}
	
	// Multiply method
	public Fraction multiply (Fraction fract2)
	{
		Fraction result = new Fraction(); // object for the result
		result.setNumerator(this.numerator * fract2.numerator); // setting numerator
		result.setDenominator(this.denominator * fract2.denominator); // setting denominator
		result.reduce(); // reducing the resul
		return result;
		
	}
	// Add operator
	public Fraction add (Fraction fract2)
	{
		Fraction result = new Fraction();
		int denominator = this.denominator * fract2.denominator; // setting the denominator for result
		int numerator = ((denominator/this.denominator)*this.numerator) + ((denominator/fract2.denominator)*fract2.numerator); // finding the numerator
		result.setDenominator(denominator); 
		result.setNumerator(numerator);
		result.reduce(); // reducing the result to it's simplest form
		return result;
	}
	// equals method
	public boolean equals(Fraction fract2)
	{
		if(this.numerator == fract2.numerator && this.denominator == fract2.denominator) { // checking if the values are equal
			return true;
		}
		else {
			return false;
		}
	}
	// Greater Than or Equal
	public boolean greaterThanOrEqualTo(Fraction fract2) { 
		Double num1 = (double)this.numerator/this.denominator * 1.00;
		Double num2 = (double)fract2.numerator/fract2.denominator * 1.00;
		boolean result = num1 >= num2 ? true : false;
		return result;
	}
	// Less Than or Equal
	public boolean lessThanOrEqualTo (Fraction fract2) { 
		Double num1 = (double)this.numerator/this.denominator * 1.00;
		Double num2 = (double)fract2.numerator/fract2.denominator * 1.00;
		boolean result = num1 <= num2 ? true : false;
		return result;
	}
}
