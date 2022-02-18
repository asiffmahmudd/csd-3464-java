package q2;

public class FractionDemo {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4,5); // new fraction object
		Fraction f2 = new Fraction(3,4); // new fraction object
		System.out.println(f1 + " " +f2); // testing tostring
		System.out.println(f1.lessThanOrEqualTo(f2)); // testing lessThanOrEqualTo method
		System.out.println(f1.greaterThanOrEqualTo(f2)); // testing greaterThanOrEqualTo method
		
		Fraction f3 = new Fraction(3,8); // new fraction object
		Fraction f4 = new Fraction(1,4); // new fraction object
		System.out.println(f3.add(f4)); // testing add method
		System.out.println(f1.getDenominator()); // testing getDenominator method
		System.out.println(f1.getNumerator()); // testing getNumerator method
		
		f1.setDenominator(7); // testing setDenominator method
		f1.setNumerator(8); // testing setNumerator method
		System.out.println(f1);
	}

}
