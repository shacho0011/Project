package com.example.aust;

public class GPACalculation {
	
	private float GPA;
	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public float getCredit() {
		return Credit;
	}

	public void setCredit(float credit) {
		Credit = credit;
	}

	private float Credit;
	
	public static float GPA(float number){
		if(number<=100 && number>=80) return 4;
		else if(number<80 && number>=75) return (float) 3.75;
		else if(number<75 && number>=70) return (float) 3.50;
		else if(number<70 && number>=65) return (float) 3.25;
		else if(number<65 && number>=60) return (float) 3.00;
		else if(number<60 && number>=55) return (float) 2.75;
		else if(number<55 && number>=50) return (float) 2.50;
		else if(number<50 && number>=45) return (float) 2.25;
		else if(number<45 && number>=40) return (float) 2.00;
		else if(number<40 && number>=0) return (float) 0.00;
		else return (float) -1.00;
	}
	
	public static String LetterGrade(float gpa){
		if(gpa==4) return "A+";
		else if(gpa<4 && gpa>=3.75) return "A";
		else if(gpa<3.75 && gpa>=3.50) return "A-";
		else if(gpa<3.50 && gpa>=3.25) return "B+";
		else if(gpa<3.25 && gpa>=3.00) return "B";
		else if(gpa<3.00 && gpa>=2.75) return "B-";
		else if(gpa<2.75 && gpa>=2.50) return "C+";
		else if(gpa<2.50 && gpa>=2.25) return "C";
		else if(gpa<2.25 && gpa>=2.00) return "D";
		else if(gpa<2.00 && gpa>=0.00) return "F";
		else return "Error!";
	}
	
	

}
