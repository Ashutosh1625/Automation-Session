package day21.predeinedclasses2;

import java.util.Scanner;

public class ScannerClasssExample3 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1;
		double num2;
		float num3;
		boolean status;
		char grade;
		String name;
		System.out.println("Enter number1: ");
		num1 = scn.nextInt();
		System.out.println("Enter number2: ");
		num2 = scn.nextDouble();
		System.out.println("Enter number3: ");
		num3 = scn.nextFloat();
		System.out.println("Enter Status: ");
		status = scn.nextBoolean();
		System.out.println("Enter Grade: ");
		grade = scn.next().charAt(0);
		System.out.println("Enter Name: ");
		name = scn.next();

		System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + status + "\n" + grade + "\n" + name);
	}

}