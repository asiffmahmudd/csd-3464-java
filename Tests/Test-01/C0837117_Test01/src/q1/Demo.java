package q1;

public class Demo {

	public static void main(String[] args) {
		Isbn i = new Isbn("978 0 13 404167 4");
		Isbn i2 = new Isbn("978","0", "13", "404167", "4", "-");
		Isbn i3 = new Isbn(i);
//		System.out.println(i.toString());
//		System.out.println(i2.toString());
		i3.setCheckDigit("1");
		i3.setPrefix("978");
		i3.setPublication("123");
		i3.setRegistrant("3245");
		i3.setResgistrationGroup("23234");
		i3.setSeperator("-");
//		System.out.println(i2.getCheckDigit());
//		System.out.println(i2.getPrefix());
//		System.out.println(i2.getPublication());
//		System.out.println(i2.getResgistrationGroup());
//		System.out.println(i2.getRegistrant());
//		System.out.println(i2.getSeperator());
//		System.out.println(i3);
//		System.out.println(i.equals(i2));
//		System.out.println(i2.equals(i3));
		
		Textbook t1 = new Textbook();
		Textbook t2 = new Textbook("Wonder", "Years", i, 10, 20);
		Textbook t3 = new Textbook(t2);
		Textbook t4 = new Textbook();
//		System.out.println(t1);
//		System.out.println(t2);
		t3.setEdition(20);
		t3.setIsbn(i2);
		t3.setNumPages(100);
		t3.setPublisher("Alokito");
		t3.setTitle("Morning");
//		System.out.println(t3);
//		System.out.println(t4.equals(t1));
		
		Course c1 = new Course();
		Course c2 = new Course("Programming", "CSD110", "Nothing to say", t2, 3);
		Course c3 = new Course(c2);
		System.out.println(c3.equals(c1));
	}

}
