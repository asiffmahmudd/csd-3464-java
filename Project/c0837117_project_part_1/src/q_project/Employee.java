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
	
	public Employee(String firstName, String lastName, String sin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sin = sin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSin() {
		return sin;
	}

	public void setSin(String sin) {
		this.sin = sin;
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
