package q_project;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */
public class CommissionEmployee extends Employee{
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee(String firstName, String lastName, String sin, double rate, double sales) throws InvalidSIN{
		super(firstName, lastName, sin);
		this.setCommissionRate(rate);
		this.setGrossSales(sales);
		this.numEmployee++;
	}
	
	public CommissionEmployee(CommissionEmployee c) throws InvalidSIN{
		super(c.firstName, c.lastName, c.sin);
		this.commissionRate = c.commissionRate;
		this.grossSales = c.grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate < 0 || commissionRate > 100) {
			throw new IllegalArgumentException("Error: commission rate should be between 0% and 100%");
		}
		else {
			this.commissionRate = commissionRate/100.00;
		}
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0) {
			throw new IllegalArgumentException("Error: gross sales must be a value of 0  or greater");
		}
		else {
			this.grossSales = grossSales;
		}
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
				+ "Commission Rate: " + commissionRate*100 + "%\n"
				+ "TOTAL: $" + earnings();
	}
	
	
}
