/* 
 Name: Asif Mahmud
 ID: C0837117
 Date
*/
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
	private static int numEmployees;
	private int empNum;
	private Name name;
	private Calendar dateOfHire;
	// Two Parameter Constructor
	public Employee(String name, String dateOfHire)
	{
		numEmployees++;
		this.empNum = numEmployees;
		
		String[] date = dateOfHire.split("/");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		this.dateOfHire = new GregorianCalendar(year, month, day); // sets calendar object to specific year, month, day 
		
		this.name = new Name(name);
		
	}
	// Copy Constructor
	public Employee(Employee empToCopy)
	{
		numEmployees++;
		this.empNum = numEmployees;
		
		this.name = new Name(empToCopy.name);
		this.dateOfHire = (Calendar)(empToCopy.dateOfHire.clone());
		
	}
	// Mutator - DateOfHire
	public void setDateOfHire(int year, int month, int day)
	{
		dateOfHire.set(Calendar.DATE, day);
		dateOfHire.set(Calendar.MONTH, month);
		dateOfHire.set(Calendar.YEAR, year);
	} 
	// Accessor - DateOfHire
	public String getDateOfHire()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, YY");
		return sdf.format(dateOfHire.getTime());
	} 
	// Mutator - DateOfHireDay
	public void setDateOfHireDay(int day)
	{
		dateOfHire.set(Calendar.DATE, day);
	}
	// Mutator - DateOfHireMonth
	public void setDateOfHireMonth(int month)
	{
		dateOfHire.set(Calendar.MONTH, month);
	}
	// Mutator - DateOfHireYear
	public void setDateOfHireYear(int year)
	{
		dateOfHire.set(Calendar.YEAR, year);
	}
	// Mutator - Name
	public void setName(String first, String middle, String last)
	{
		this.name.setFirstName(first);
		this.name.setMiddleName(middle);
		this.name.setLastName(last);
	}
	// Accessor – Name
	public String getName()
	{
		return this.name.toString();
	} 
	// Mutator - FirstName
	public void setFirstName(String first)
	{
		this.name.setFirstName(first);
	}
	// Accessor – FirstName
	public String getFirstName()
	{
		return this.name.getFirstName();
	} 
	// Mutator - MiddleName
	public void setMiddleName(String middle)
	{
		this.name.setMiddleName(middle);
	}
	// Accessor – MiddleName
	public String getMiddleName()
	{
		if(this.name.getMiddlName() == null) {
			return "None";
		}
		else {
			return this.name.getMiddlName();
		}
	} 
	// Mutator - LastName
	public void setLastName(String last)
	{
		this.name.setLastName(last);
	}
	// Accessor – LastName
	public String getLastName()
	{
		return this.name.getLastName();
	} 
	// toString method
	@Override
	public String toString()
	{
		return this.empNum + " : " + this.name.toString() + " - " + this.getDateOfHire(); 
	}
	 
	// equals method
	@Override
	public boolean equals(Object o)
	{
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) o;
        
        if(e.empNum != this.empNum) {
        	return false;
        }
         
        // Compare the data members and return accordingly
        return name.equals(e.name)  && dateOfHire.equals(e.dateOfHire);
	}
}

