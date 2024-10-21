package day21.predeinedclasses2;

import java.util.Scanner;

public class ScannerClassExample2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1, num2, res;
		System.out.println("Enter number1: ");
		num1 = scn.nextInt();
		System.out.println("Enter number2: ");
		num2 = scn.nextInt();
		System.out.println("Number1 is : " + num1);
		System.out.println("Number2 is : " + num2);
		res = num1 + num2;
		System.out.println("Addtion of two number: " + res);
	}
}