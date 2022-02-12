package q6;

public class StudentRecordDemo {
	public static void main(String args[]) {
		StudentRecord s1 = new StudentRecord();
		StudentRecord s2 = new StudentRecord(8,9,10,85, 90);
		
		s1.setExamPoints(-2);
		System.out.println(s1.getExamPoints());
		s1.setExamPoints(1000);
		System.out.println(s1.getExamPoints());
		s1.setExamPoints(87);
		System.out.println(s1.getExamPoints());
		System.out.println("---------------------");
		
		s1.setMidtermPoints(-2);
		System.out.println(s1.getMidtermPoints());
		s1.setMidtermPoints(1000);
		System.out.println(s1.getMidtermPoints());
		s1.setMidtermPoints(90);
		System.out.println(s1.getMidtermPoints());
		System.out.println("---------------------");
		
		s1.setQuizPoints(1, -2);
		System.out.println(s1.getQuizPoints(1));
		s1.setQuizPoints(5, 9);
		System.out.println(s1.getQuizPoints(5));
		s1.setQuizPoints(2, 11);
		System.out.println(s1.getQuizPoints(2));
		s1.setQuizPoints(2, 8);
		System.out.println(s1.getQuizPoints(2));
		s1.setQuizPoints(3, 8);
		System.out.println(s1.getQuizPoints(3));
		System.out.println("---------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
