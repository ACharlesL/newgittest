import java.util.Scanner;

public class GradeDistro {

	int A;
	int B;
	int C;
	int D;
	int F;
	int totalNumOfGrades;
	int APercentage;
	int BPercentage;
	int CPercentage;
	int DPercentage;
	int FPercentage;
	
	Scanner keyboard= new Scanner(System.in); 
	
	public void setA(int a) {
		A = a;
	}
	public void setB(int b) {
		B = b;
	}
	public void setC(int c) {
		C = c;
	}
	public void setD(int d) {
		D = d;
	}
	public void setF(int f) {
		F = f;
	}
	public int getA() {
		return A;
	}
	public int getB() {
		return B;
	}
	public int getC() {
		return C;
	}
	public int getD() {
		return D;
	}
	public int getF() {
		return F;
	}
	//method to take user input
	public void userInput(){
	System.out.println("how many A grades do you have?");
	A=keyboard.nextInt();	
	System.out.println("how many B grades do you have?");
	B=keyboard.nextInt();
	System.out.println("how many C grades do you have?");
	C=keyboard.nextInt();
	System.out.println("how many D grades do you have?");
	D=keyboard.nextInt();
	System.out.println("how many F grades do you have?");
	F=keyboard.nextInt();
	}
	//method to calculate total amount of grades
	public int totalgrades(){
		totalNumOfGrades=A+B+C+D+F;
		return totalNumOfGrades;
	}
	//method to calculate percentage of A grades
	public int APerc(){
		APercentage= (A*100)/totalNumOfGrades;		
		return APercentage;
	}
	//method to calculate percentage of B grades
	public int BPerc(){
		BPercentage= (B*100)/totalNumOfGrades;		
		return BPercentage;
	}
	//method to calculate percentage of C grades
	public int CPerc(){
		CPercentage= (C*100)/totalNumOfGrades;		
		return CPercentage;
	}
	//method to calculate percentage of D grades
	public int DPerc(){
		DPercentage= (D*100)/totalNumOfGrades;		
		return DPercentage;
	}
	//method to calculate percentage of B grades
	public int FPerc(){
		FPercentage= (F*100)/totalNumOfGrades;		
			return FPercentage;
	}
	//this method displays the result in a graph
	public void displaygraph(){
		System.out.println("Total number of grades "+totalNumOfGrades);
		System.out.println("Percentage of A's : " +APercentage+ "%");
		System.out.println("Percentage of B's : " +BPercentage+ "%");
		System.out.println("Percentage of C's : " +CPercentage+ "%");
		System.out.println("Percentage of D's : " +DPercentage+ "%");
		System.out.println("Percentage of F's : " +FPercentage+ "%");
	}
	//first line of graph for loop
	for(int i=0, a=0;i<11;i++,a=a+10 )
		System.out.print(a+"     ");
		System.out.print("%");
		System.out.println();
		
	for(int i=0;i<11;i++)
		System.out.print("|"+"     ");
		System.out.println();
	for(int i=0;i<50;i++)
		System.out.print("*");
		System.out.println();
	for(int i=0;i<APercentage;i=i+2)
		System.out.print("*");
		System.out.println();
	for(int i=0;i<=BPercentage;i=i+2)
		System.out.print("*");
		System.out.print("")
}
