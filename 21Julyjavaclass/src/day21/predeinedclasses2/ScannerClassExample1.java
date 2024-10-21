package day21.predeinedclasses2;

import java.util.Scanner;

public class ScannerClassExample1 {

	public static void main(String[] args) {
		int num1,num2, res;
		
//		num1=10;
//		num2=20;
//		res=num1+num2;
		
		//if you want to take input at runtime dn use Scanner class
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter number1 value of your choice: ");
		num1=scn.nextInt();
		System.out.println("Please enter number2 value of your choice: ");
		num2=scn.nextInt();
		res=num1+num2;
		
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}

}