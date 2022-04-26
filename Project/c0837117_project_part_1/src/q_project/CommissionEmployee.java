package q_project;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */
public class CommissionEmployee extends Employee{
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee(String firstName, String lastName, String sin, double rate, double sales) {
		super(firstName, lastName, sin);
		this.commissionRate = rate/100;
		this.grossSales = sales;
		this.numEmployee++;
	}
	
	public CommissionEmployee(CommissionEmployee c) {
		super(c.firstName, c.lastName, c.sin);
		this.commissionRate = c.commissionRate;
		this.grossSales = c.grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public double earnings() {
		return grossSales * commissionRate;
	}

	@Override
	public String toString() {
		return "Type: Salaries\n"
				+ "Name: " + lastName + ", " + firstName + "\n"
				+ "SIN: " + sin + "\n"
				+ "Gross Sales: $" + grossSales + "\n"
				+ "Commission Rate: " + commissionRate + "\n"
				+ "TOTAL: $" + earnings();
	}
	
	
}
