package q_project;
import java.util.ArrayList;
/*
 * Name: Asif Mahmud
 * ID: C0837117
 */
public class PayrollTester {

	public static void main(String[] args) {
		SalariedEmployee s1 = new SalariedEmployee("Joe", "Francis", "123456789", 2500);
		SalariedEmployee s2 = new SalariedEmployee("Samatha", "Hughes", "444555666", 1400);
		s2.setManager(s1);
		
		HourlyEmployee h = new HourlyEmployee("Kim", "Adams", "888999000", 42, 18.50);
		h.setManager(s1);
		
		CommissionEmployee c = new CommissionEmployee("Ryan", "Goodall", "111222333", 10, 9000);
		c.setManager(s2);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(s1);
		employeeList.add(s2);
		employeeList.add(h);
		employeeList.add(c);
		
		Employee highestPaid = employeeList.get(0);
		Employee lowestPaid = employeeList.get(0);
		double totalPay = 0;
		double earning;
		int numberOfSalariedEmployees = 0;
		int numberOfHourlyEmployees = 0;
		int numberOfCommissionEmployees = 0;
		
		for(int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).toString() + "\n");
			earning = employeeList.get(i).earnings();
			totalPay += earning;
			
			if(employeeList.get(i) instanceof SalariedEmployee) {
				numberOfSalariedEmployees++;
			}
			else if(employeeList.get(i) instanceof HourlyEmployee) {
				numberOfHourlyEmployees++;
			}
			else if(employeeList.get(i) instanceof CommissionEmployee) {
				numberOfCommissionEmployees++;
			}
			
			if(highestPaid.earnings() < earning) {
				highestPaid = employeeList.get(i);
			}
			if(lowestPaid.earnings() > earning) {
				lowestPaid = employeeList.get(i);
			}
		}
		
		System.out.println("SUMMARY STATISTICS\n"
						   + "Highest Paid Employee: " + highestPaid.getLastName() + ", " + highestPaid.getFirstName() + "\n"
						   + "Lowest Paid Employee: " + lowestPaid.getLastName() + ", " + lowestPaid.getFirstName() + "\n"
				   		   + "Number of salaried employees: " + numberOfSalariedEmployees + "\n"
				   		   + "Number of Hourly employees: " + numberOfHourlyEmployees + "\n"
				   		   + "Number of Commission employees: " + numberOfCommissionEmployees + "\n"
			   		   	   + "Total for Pay Period: $" + totalPay);
	}

}
