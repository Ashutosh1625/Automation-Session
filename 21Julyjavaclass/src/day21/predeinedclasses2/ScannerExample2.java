package day21.predeinedclasses2;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		String name;
		char grade;
		double p,interest,r;
		int t;
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name=scn.next();
		System.out.println("Please enter your grade: ");
		grade=scn.next().charAt(0);
		System.out.println("Please enter your priciple: ");
		p=scn.nextDouble();
		System.out.println("Please enter your ROI: ");
		r=scn.nextDouble();
		System.out.println("Please enter your duration: ");
		t=scn.nextInt();
		
		System.out.println("Candidate name is: "+name);
		System.out.println("Candidate grade is: "+grade);
		interest=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI amount is: "+r);
		System.out.println("Duration amount is: "+t);
		System.out.println("Interest amount is: "+interest);
		
		scn.close();
	}
}