package q_project;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */
public class HourlyEmployee extends Employee{
	private double hours;
	private double hourlyRate;
	
	public HourlyEmployee(String firstName, String lastName, String sin, double hours, double rate) {
		super(firstName, lastName, sin);
		this.hours = hours;
		this.hourlyRate = rate;
		this.numEmployee++;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double earnings() {
		if(this.hours <= 40) {
			return hours*hourlyRate;
		}
		else {
			return (40 * hourlyRate) + ((hours - 40) * hourlyRate * 1.5);
		}
	}
	
	@Override
	public String toString() {
		return "Type: Hourly\n"
				+ "Name: " + lastName + ", " + firstName + "\n"
				+ "SIN: " + sin + "\n"
				+ "Hourly Rate: $" + hourlyRate + "\n"
				+ "Hours Worked: " + hours + "\n"
				+ "TOTAL: $" + earnings();
	}
}
