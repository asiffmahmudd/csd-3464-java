package q_project;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */
public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String sin, double weeklySalary) throws InvalidSIN{
		super(firstName, lastName, sin);
		this.setSalary(weeklySalary);
		this.numEmployee++;
	}

	public double getSalary() {
		return weeklySalary;
	}

	public void setSalary(double weeklySalary) {
		if(weeklySalary < 0) {
			throw new IllegalArgumentException("Error: weekly salary cannot be a negative value");
		}
		else {
			this.weeklySalary = weeklySalary;
		}
	}

	public double earnings() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return "Type: Salaried\n"
				+ "Name: " + lastName + ", " + firstName + "\n"
				+ "SIN: " + sin + "\n"
				+ "Weekly Salary: $" + weeklySalary + "\n"
				+ "TOTAL: $" + earnings();
	}
	
	
	
	
}
