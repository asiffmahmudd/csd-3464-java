package q_project;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */

public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String sin;
	protected Employee managedBy;
	protected static int numEmployee;
	
	public Employee(String firstName, String lastName, String sin) throws InvalidSIN{
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSin(sin);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException("Error: Invalid first name provided");
		}
		else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException("Error: Invalid last name provided");
		}
		else {
			this.lastName = lastName;
		}
	}

	public String getSin() {
		return sin;
	}
	
	//method for checking numeric value
	private boolean isNumeric(String sin) {
		try {  
		    Double.parseDouble(sin);  
		    return true;
		} catch(NumberFormatException e){  
			return false;  
		} 
	}
	
	//method for doubling the even digits and add them
	private int doubleEvenAndAdd(String str) {
		int sum = 0 , temp = 0, digitSum = 0;
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 1) {
				temp = Integer.parseInt(""+str.charAt(i)) * 2;
				if(temp > 9) {
					digitSum = 0;
					while(temp != 0) {
						digitSum += temp%10;
						temp = temp/10;
					}
					sum += digitSum;
				}
				else {
					sum += temp;
				}
			}
		}
		return sum;
	}
	
	//method for adding the odd digits
	private int sumOfOdds(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 0) {
				sum += Integer.parseInt(""+str.charAt(i));
			}
		}
		return sum;
	}

	public void setSin(String sin) throws InvalidSIN{
		if(sin != null && sin.length() == 9 && isNumeric(sin)){
			int checkDigit = Integer.parseInt(""+sin.charAt(8));
			int evenSum = doubleEvenAndAdd(sin.substring(0, 8));
			int oddSum = sumOfOdds(sin.substring(0, 8));
			int sum = evenSum + oddSum;
			int nearestMultipleOfTen = (int)Math.ceil(sum/10.0) * 10;
			if(nearestMultipleOfTen - sum != checkDigit) {
				throw new InvalidSIN();
			}
			else {
				this.sin = sin;
			}
		}
		else {
			throw new InvalidSIN();
		}
	}

	public Employee getManager() {
		return managedBy;
	}

	public void setManager(Employee managedBy) {
		this.managedBy = managedBy;
	}

	public static int count() {
		return numEmployee;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Employee) {
			Employee emp1 = this;
			Employee emp2 = (Employee) obj;
			if(emp1.sin.equals(emp2.sin)){
				return true;
			}
		}
		return false;
	}

	public abstract double earnings();
	
	@Override
	public String toString() {
		return "Name: " + lastName + ", " + firstName
				+ "SIN" +sin;
	}
	
	
}
