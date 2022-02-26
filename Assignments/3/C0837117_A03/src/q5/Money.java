package q5;
import java.text.*;
/* 
Name: Asif Mahmud
ID: C0837117
Date: 2/19/2022
*/

public class Money
{ 
	private int dollars;
	private int cents;
	// No Parameter Constructor
	public Money()
	{
		this.dollars = 0;
		this.cents = 0;
	}
	// One Parameter Constructor
	public Money(int dollars)
	{
		if(dollars >= 0) {
			this.dollars = dollars;
		}
		else {
			this.dollars = 0;
		}
	}
	// Two Parameter Constructor
	public Money(int dollars, int cents)
	{
		int extraDollar = 0;
		if(cents >= 0) {
			extraDollar += cents/100; // extra dollars if cents > 100
			this.cents = cents%100; // remainder is the actual cents value
		}
		else {
			this.cents = 0; // negative value sets to 0
		}
		if(dollars >= 0) {
			this.dollars = dollars + extraDollar; // setting the dollar value
		}
		else {
			this.dollars += extraDollar; // negative value sets to 0
		}
		
	}
	// Mutator - Dollars
	public void setDollars(int dollars)
	{
		if(dollars >= 0) {
			this.dollars = dollars;
		}
		else {
			this.dollars = 0; // negative value sets to 0
		}
	} 
	// Accessor - Dollars
	public int getDollars()
	{
		return this.dollars;
	} 
	// Mutator - Cents
	public void setCents(int cents)
	{
		if(cents >= 0) {
			if(cents >= 100) {
				int dollars = cents/100; // extra dollars if cents > 100
				cents = cents%100; // remainder is the actual cents value
				this.cents = cents; 
				this.dollars = dollars + this.dollars;
			}
			else {
				this.cents = cents;
			}
		}
		else {
			this.cents = 0;  // negative value sets to 0
		}
	}
	// Accessor - Cents
	public int getCents()
	{
		return cents;
	}
	// add method
	public void add(Money money)
	{
		int cents = this.cents + money.cents; 
		int dollars = this.dollars + money.dollars;
		this.setDollars(dollars);
		this.setCents(cents);
	}
	// minus method
	public void minus(Money money)
	{
		int cents1 = this.cents + (this.dollars * 100); // converting all money into cents
		int cents2 = money.cents + (money.dollars * 100); // converting all money into cents
		int result = cents1 - cents2; // calculating the value
		if(result < 0) {
			this.dollars = 0;
			this.cents = 0;
		}
		else {
			this.dollars = result / 100; // converting into dollars from the calculated value
			this.cents = result % 100; // converting into cents from the calculated value
		}
	}
	// STATIC add method
	public static Money add(Money money1, Money money2)
	{
		Money result = new Money();
		int dollars = money1.dollars + money2.dollars;
		int cents = money1.cents + money2.cents;
		
		result.setDollars(dollars);
		result.setCents(cents);
		return result;
	}
	// STATIC minus method
	public static Money minus(Money money1, Money money2)
	{
		Money result = new Money();
		int cents1 = money1.cents + (money1.dollars * 100); // converting all money into cents
		int cents2 = money2.cents + (money2.dollars * 100); // converting all money into cents
		int resultCents = cents1 - cents2; // calculating the value
		if(resultCents < 0) {
			result.dollars = 0;
			result.cents = 0;
		}
		else {
			result.dollars = resultCents / 100; // converting into dollars from the calculated value
			result.cents = resultCents % 100; // converting into cents from the calculated value
		}
		return result;
	}
	// toString method
	@Override
	public String toString()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		Double money = this.dollars + (this.cents/100.00);
		return nf.format(money);
	}
	 
	 
	public boolean equals(Money money)
	{
		if(this.dollars == money.dollars && this.cents == money.cents) {
			return true;
		}
		else {
			return false;
		}
	}
}
