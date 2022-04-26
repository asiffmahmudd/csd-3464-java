package q_project;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */
public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String sin, double weeklySalary) {
		super(firstName, lastName, sin);
		this.weeklySalary = weeklySalary;
		this.numEmployee++;
	}

	public double getSalary() {
		return weeklySalary;
	}

	public void setSalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
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
