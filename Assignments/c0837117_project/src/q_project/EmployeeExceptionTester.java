package q_project;
import java.util.*;

public class EmployeeExceptionTester {
	public static void main(String args[]) {
		int option = 0;
		try {
			System.out.println("Welcome to Employee Exception Tester!\n");
			displayOptions();
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();
			if(option < 1 || option > 3) {
				throw new InputMismatchException("You have entered incorrect information. We will now re-prompt you for all inputs.\n");
			}
			option = processOption(option);
			System.out.println();
			System.out.println("Employee successfully created!\n");
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			processOption(option);
		}
	}
	
	//method for checking for valid options and catching for errors
	public static int processOption(int option) {
		Scanner scan = new Scanner(System.in);
		while(option < 1 || option > 3) {
			try {
				displayOptions();
				option = scan.nextInt();
				if(option < 1 || option > 3) {
					throw new InputMismatchException("You have entered incorrect information. We will now re-prompt you for all inputs.\n");
				}
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		}
		if(option == 1) {
			SalariedEmployee s = null;
			boolean isInvalid = true;
			while(isInvalid == true) {
				try {
					s = getSalariedEmployee(scan);
					isInvalid = false;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.print("You have entered incorrect information. We will now re-prompt you for all inputs.\n");
				}
			}
			System.out.println("\n" + s.toString());
		}
		else if(option == 2) {
			HourlyEmployee h = null;
			boolean isInvalid = true;
			while(isInvalid == true) {
				try {
					h = getHourlyEmployee(scan);
					isInvalid = false;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.print("You have entered incorrect information. We will now re-prompt you for all inputs.\n");
				}
			}
			System.out.println("\n" + h.toString());
		}
		else if(option == 3) {
			CommissionEmployee c = null;
			boolean isInvalid = true;
			while(isInvalid == true) {
				try {
					c = getCommissionEmployee(scan);
					isInvalid = false;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.print("You have entered incorrect information. We will now re-prompt you for all inputs.\n");
				}
			}
			System.out.println("\n" + c.toString());
		}
		return option;
	}
	
	// method for displaying the options
	public static void displayOptions() {
		System.out.print("Which of the following types of employees would you like to create:\r\n" + 
				   "\t1. Salaried\r\n" + 
				   "\t2. Hourly\r\n" + 
				   "\t3. Commission\r\n" +
				   "\nPlease enter your selection: ");
	}

	//method for creating salaried employee
	public static SalariedEmployee getSalariedEmployee(Scanner scan) throws InvalidSIN{
		System.out.print("\nPlease enter employee’s first name: ");
		String firstName = scan.next();
		System.out.print("\nPlease enter employee’s last name: ");
		String lastName = scan.next();
		System.out.print("\nPlease enter employee’s SIN: ");
		String sin = scan.next();
		System.out.print("\nPlease enter employee’s weekly salary: ");
		double weeklySalary = scan.nextDouble();
		
		SalariedEmployee s  = new SalariedEmployee(firstName, lastName, sin, weeklySalary);
		return s;
	}

	//method for creating hourly employee
	public static HourlyEmployee getHourlyEmployee(Scanner scan) throws InvalidSIN{
		System.out.print("\nPlease enter employee’s first name: ");
		String firstName = scan.next();
		System.out.print("\nPlease enter employee’s last name: ");
		String lastName = scan.next();
		System.out.print("\nPlease enter employee’s SIN: ");
		String sin = scan.next();
		System.out.print("\nPlease enter employee’s hours worked: ");
		double hours = scan.nextDouble();
		System.out.print("\nPlease enter employee’s hourly rate: ");
		double rate = scan.nextDouble();
		
		HourlyEmployee h  = new HourlyEmployee(firstName, lastName, sin, hours, rate);
		return h;
	}
	
	//method for creating commissioned employee
	public static CommissionEmployee getCommissionEmployee(Scanner scan) throws InvalidSIN{
		System.out.print("\nPlease enter employee’s first name: ");
		String firstName = scan.next();
		System.out.print("\nPlease enter employee’s last name: ");
		String lastName = scan.next();
		System.out.print("\nPlease enter employee’s SIN: ");
		String sin = scan.next();
		System.out.print("\nPlease enter employee’s commission rate: ");
		double rate = scan.nextDouble();
		System.out.print("\nPlease enter employee’s total sales: ");
		double sales = scan.nextDouble();
		
		CommissionEmployee c  = new CommissionEmployee(firstName, lastName, sin, rate, sales);
		return c;
	}
}
