package q5;

public class MoneyDemo {

	public static void main(String[] args) {
		Money m1 = new Money(2,208);
		System.out.println(m1);
		System.out.println(m1.getCents());
		System.out.println(m1.getDollars());
		
		Money m2 = new Money();
		System.out.println(m2);
		m2.setCents(-20);
		m2.setDollars(-3);
		System.out.println(m2);
		m2.setCents(50);
		m2.setDollars(3);
		System.out.println(m2);
		m2.add(m1);
		System.out.println(m1 + " " + m2);

		m2.minus(m1);
		System.out.println(m1 + " " + m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m1));
		
	}

}
