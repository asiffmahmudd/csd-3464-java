package q5;

/**
 * <h1> Assignment 01 – Q5 (Credit plan) </h1>
 * A class used to show the monthly payments and balance of a stereo financing
 * @author C0837117 – Asif Mahmud
 * @since 2022-01-28
 */

public class CreditPlan {
	public static void main(String[] args) {
		double stereoCost = 1000.00; //initializing stereo cost
		double annualInterestRate = 18.00; //initializing annual interest rate
		double monthlyInterestRate = annualInterestRate/12; //calculating monthly interest rate
		double monthlyPayment = 50.00; //initializing monthly payment
		
		int month = 0;
		System.out.println("Month\tPaid Amount\tInterest\tBalance"); //printing header for the output
		double monthlyInterest = 0;
		double balance = stereoCost;
		while(balance + (balance*monthlyInterestRate/100) > monthlyPayment) { //checking to see if the balance + monthly interest greater than the monthly payment. if so the loop will continue
			monthlyInterest = balance*monthlyInterestRate/100; // calculating monthly interest amount
			balance = balance - monthlyPayment + monthlyInterest; //updating balance
			month++; //increasing month count
			System.out.println(month+"\t"+String.format("%.2f",monthlyPayment)
			+"\t\t"+String.format("%.2f",monthlyInterest)+"\t\t"+String.format("%.2f",balance)); //showing output to the console
		}
		monthlyInterest = balance*monthlyInterestRate/100;
		balance = balance  + monthlyInterest;
		monthlyPayment = balance;
		month++;
		System.out.println(month+"\t"+String.format("%.2f",monthlyPayment) 
		+"\t\t"+String.format("%.2f",monthlyInterest)+"\t\t0.00"); //calculation and output generation for the last transaction
	}
}
