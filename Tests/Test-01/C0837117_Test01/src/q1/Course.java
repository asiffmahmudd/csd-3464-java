package q1;

public class Course {
	private String name;
	private String courseCode;
	private String description;
	private Textbook txtbook;
	private double credits;
	
	public Course() {
		this.name = "TBD";
		this.courseCode = "TBD";
		this.description = " ";
		this.txtbook = null;
		this.credits = 0.0;
	}

	public Course(String name, String courseCode, String description, Textbook txtbook, double credits) {
		if(!name.isEmpty())
			this.name = name;
		else
			this.name = "TBD";
		if(!courseCode.isEmpty())
			this.courseCode = courseCode;
		else
			this.courseCode = "TBD";
		this.description = description;
		this.txtbook = txtbook;
		
		if(credits >= 0)
			this.credits = (double)credits;
		else
			this.credits = 0.0;
	}
	
	public Course(Course course) {
		this.name = course.name;
		this.courseCode = course.courseCode;
		this.description = course.description;
		this.txtbook = new Textbook(course.txtbook);
		this.credits = course.credits;
	}
	
	public boolean equals(Course course) {
		if(this.courseCode == course.courseCode) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String str = "COURSE: " + this.name + "\n" +
				"CODE: " + this.courseCode + "\n" +
				"CREDITS: " + this.credits + "\n" +
				"DESCRIPTION: " + this.description + "\n" +
				"===TEXTBOOK===\n";
		if(this.txtbook != null) {
			str += this.txtbook.toString();
		}
		else {
			str += "TBD";
		}
		return str;
	}
}
