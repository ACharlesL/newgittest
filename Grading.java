/**
 * Programming Project 3
 */
import java.util.Scanner;

public class Grading {
	
	final double midtermweight=0.25;
	final double quizweight=0.25;
	final double finalexamweight=0.5;
	
	Scanner keyboard = new Scanner(System.in);
	String name;
	int quiz1 = 0;
	int quiz2 = 0;
	int midterm = 0;
	int finalexam = 0;
	double finalgrade;
	char lettergrade;
	
	//set quiz 1 value
	public void setQuiz1(int quiz1) {
		this.quiz1 = quiz1;
	}
	//set quiz 1 value
	public void setQuiz2(int quiz2) {
		this.quiz2 = quiz2;
	}
	//set quiz 1 value
	public void setMidterm(int midterm) {
		this.midterm = midterm;
	}
	//set quiz 1 value
	public void setFinalexam(int finalexam) {
		this.finalexam = finalexam;
	}
	//get quiz 1 value
	public int getQuiz1() {
		return quiz1;
	}
	//get quiz 1 value
	public int getQuiz2() {
		return quiz2;
	}
	//get quiz 1 value
	public int getMidterm() {
		return midterm;
	}
	//get quiz 1 value
	public int getFinalexam() {
		return finalexam;
	}
	
	//get student info
	public void studentinput(){
		System.out.println("Enter student name");
		name = keyboard.next();
		System.out.println("Enter student Quiz 1 score base on score/10]");
		quiz1 = keyboard.nextInt();
		System.out.println("Enter student Quiz 2 score base on score/10]");
		quiz2 = keyboard.nextInt();
		System.out.println("Enter students midterm score base on score/100]");
		midterm = keyboard.nextInt();
		System.out.println("Enter students final exam score base on score/100]");
		finalexam = keyboard.nextInt();
	}
	
	//calculating final grade
	public void finalGrade()
	{
		finalgrade = (finalexam * finalexamweight)+(midterm * midtermweight)+((quiz1+quiz2)*5*quizweight);
	}
	
	//assigning and calculating letter grades
	public void lettergrade()
	{
		if (finalgrade >= 90)
		{
			lettergrade = 'A';
		}
		else if(finalgrade >= 80 && finalgrade <= 89)
		{
			lettergrade = 'B';
		}
		else if(finalgrade >= 70 && finalgrade <= 79)
		{
			lettergrade = 'C';
		}
		else if(finalgrade >= 60 && finalgrade <= 69)
		{
			lettergrade = 'D';
		}
		else if(finalgrade < 60)
		{
			lettergrade = 'F';
		}
	}
	
	public void studentoutput(){
		System.out.println("Student name: "+ name);
		System.out.println("Mid term scores: "+ midterm);
		System.out.println("Final exam score: "+ finalexam);
		System.out.println("quiz 1: "+quiz1);
		System.out.println("quiz 2: "+quiz2);
		System.out.println("final grade "+finalgrade+"%");
		System.out.println(name+" got an "+lettergrade);
	}
	
}
