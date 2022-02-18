package q6;
import java.text.DecimalFormat;

public class StudentRecord {
	 public static final int MAX_QUIZ_POINTS = 10;
	 public static final int MAX_MIDTERM_POINTS = 100;
	 public static final int MAX_EXAM_POINTS = 100;
	 private int quiz01Points;
	 private int quiz02Points;
	 private int quiz03Points;
	 private int midtermPoints;
	 private int examPoints;
	 private char letterGrade;
	 private double numericGrade;
	 // No Parameter Constructor
	 public StudentRecord()
	 {
		 this.quiz01Points = 0;
		 this.quiz02Points = 0;
		 this.quiz03Points = 0;
		 this.midtermPoints = 0;
		 this.examPoints = 0;
		 this.letterGrade = 'F';
		 this.numericGrade = 0;
	 }
	 // Five Parameter Constructor
	 public StudentRecord(int quiz01Points, int quiz02Points, int 
	quiz03Points, int midtermPoints, int examPoints)
	 {
		 // quiz 1
		 if(quiz01Points < 0) {
			 this.quiz01Points = 0;
		 }
		 else if (quiz01Points > MAX_QUIZ_POINTS) {
			 this.quiz01Points = MAX_QUIZ_POINTS;
		 }
		 else {
			 this.quiz01Points = quiz01Points;
		 }
		 
		 // quiz 2
		 if(quiz02Points < 0) {
			 this.quiz02Points = 0;
		 }
		 else if (quiz02Points > MAX_QUIZ_POINTS) {
			 this.quiz02Points = MAX_QUIZ_POINTS;
		 }
		 else {
			 this.quiz02Points = quiz02Points;
		 }
		 
		// quiz 3
		 if(quiz03Points < 0) {
			 this.quiz03Points = 0;
		 }
		 else if (quiz03Points > MAX_QUIZ_POINTS) {
			 this.quiz03Points = MAX_QUIZ_POINTS;
		 }
		 else {
			 this.quiz03Points = quiz03Points;
		 }
		 
		// midterm
		 if(midtermPoints < 0) {
			 this.midtermPoints = 0;
		 }
		 else if (midtermPoints > MAX_MIDTERM_POINTS) {
			 this.midtermPoints = MAX_MIDTERM_POINTS;
		 }
		 else {
			 this.midtermPoints = midtermPoints;
		 }
		 
		// exam points
		 if(examPoints < 0) {
			 this.examPoints = 0;
		 }
		 else if (examPoints > MAX_EXAM_POINTS) {
			 this.examPoints = MAX_EXAM_POINTS;
		 }
		 else {
			 this.examPoints = examPoints;
		 }
		 
		 calculate();
	 }
	 // Mutator – QuizPoints
	 public void setQuizPoints(int quizNum, int quizPoints)
	 {
		 if(quizNum >= 1 && quizNum <= 3) {
			 if(quizPoints < 0) {
				 if(quizNum == 1) {
					 this.quiz01Points = 0;
				 }
				 else if(quizNum == 2) {
					 this.quiz02Points = 0;
				 }
				 else {
					 this.quiz03Points = 0;
				 }
			 }
			 else if(quizPoints > MAX_QUIZ_POINTS) {
				 if(quizNum == 1) {
					 this.quiz01Points = MAX_QUIZ_POINTS;
				 }
				 else if(quizNum == 2) {
					 this.quiz02Points = MAX_QUIZ_POINTS;
				 }
				 else {
					 this.quiz03Points = MAX_QUIZ_POINTS;
				 }
			 }
			 else {
				 if(quizNum == 1) {
					 this.quiz01Points = quizPoints;
				 }
				 else if(quizNum == 2) {
					 this.quiz02Points = quizPoints;
				 }
				 else {
					 this.quiz03Points = quizPoints;
				 }
			 }
			 calculate();
		 }
	 } 
	 // Accessor - QuizPoints
	 public int getQuizPoints (int quizNum)
	 {
		 if(quizNum >= 1 && quizNum <= 3) {
			 if(quizNum == 1) {
				 return this.quiz01Points;
			 }
			 if(quizNum == 2) {
				 return this.quiz02Points;
			 }
			 else {
				 return this.quiz03Points;
			 }
		 }
		 else {
			 return -1;
		 }
	 } 
	 // Mutator - MidtermPoints
	 public void setMidtermPoints(int midtermPoints)
	 {
		 if(midtermPoints < 0) {
			  this.midtermPoints = 0;
		 }
		 else if(midtermPoints > MAX_MIDTERM_POINTS) {
			  this.midtermPoints = MAX_MIDTERM_POINTS;
		 }
		 else {
			  this.midtermPoints = midtermPoints;
		 }
		 calculate();
	 }
	 // Accessor - MidtermPoints
	 public int getMidtermPoints()
	 {
	 	 return this.midtermPoints;
	 }
	 // Mutator - ExamPoints
	 public void setExamPoints(int examPoints)
	 {
		 if(examPoints < 0) {
			  this.examPoints = 0;
		 }
		 else if(examPoints > MAX_EXAM_POINTS) {
			  this.examPoints = MAX_EXAM_POINTS;
		 }
		 else {
			  this.examPoints = examPoints;
		 }
		 calculate();
	 }
	 // Accessor - ExamPoints
	 public int getExamPoints()
	 {
	 	 return this.examPoints;
	 }
	 //calculate method
	 private void calculate()
	 {
		 double quizzes = (this.quiz01Points + this.quiz02Points + this.quiz03Points) * 25.00 / 30;
		 double midterm = (this.midtermPoints * 35.00) / MAX_MIDTERM_POINTS;
		 double exam = (this.examPoints * 40.00) / MAX_EXAM_POINTS;
		 double result = quizzes + midterm + exam;
		 this.numericGrade = result;
		 if(result >= 90) {
			 this.letterGrade = 'A';
		 }
		 else if(result >= 80) {
			 this.letterGrade = 'B';
		 }
		 else if(result >= 70) {
			 this.letterGrade = 'C';
		 }
		 else if(result >= 60) {
			 this.letterGrade = 'D';
		 }
		 else {
			 this.letterGrade = 'F';
		 }
	 }
	 // toString method
	 @Override
	 public String toString()
	 {
		 DecimalFormat df = new DecimalFormat("00.00");
	 	 return "Quiz 01: "+ this.quiz01Points +" points\n" + 
	 	 		"Quiz 02: "+ this.quiz02Points +" points\n" + 
	 	 		"Quiz 03: "+ this.quiz03Points +" points\n" + 
	 	 		"Midterm: "+ this.midtermPoints +" points\n" + 
	 	 		"Exam: "+ this.examPoints +" points\n" + 
	 	 		"Numeric Grade: "+ df.format(this.numericGrade) +" \n" +
	 	 		"Letter Grade: "+ this.letterGrade +"\n";
	 }
	 // equals method
	 public boolean equals(StudentRecord stdRcd2)
	 {
	 	 if(this.quiz01Points == stdRcd2.quiz01Points && this.quiz02Points == stdRcd2.quiz02Points 
	 		&& this.quiz03Points == stdRcd2.quiz03Points && this.midtermPoints == stdRcd2.midtermPoints
	 		&& this.examPoints == stdRcd2.examPoints) {
	 		 return true;
	 	 }
	 	 else {
	 		 return false;
	 	 }
	 }

}
