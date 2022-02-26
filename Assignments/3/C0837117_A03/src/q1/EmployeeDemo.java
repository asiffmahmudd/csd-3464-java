package q1;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Asif Mahmud", "22/2/2");
		Employee e2 = new Employee("Not Asif Mahmud", "21/3/7");
		System.out.println(e1.equals(e2));
		System.out.println(e1.getDateOfHire());
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println(e1.getMiddleName());
		System.out.println(e1.getName());
		e1.setFirstName("Brian");
		e1.setLastName("Tat");
		e1.setMiddleName("Chou");
		e1.setDateOfHire(2021, 10, 9);
		System.out.println(e1.toString());
		e2.setDateOfHireDay(10);
		e2.setDateOfHireMonth(6);
		e2.setDateOfHireYear(2022);
		e2.setName("First", "middle", "last");
		System.out.println(e2.toString());
		
		Employee e = new Employee(e1);
		System.out.println(e);
		
		e.setFirstName("test");
		System.out.println(e);
		System.out.println(e1);
	}

}
