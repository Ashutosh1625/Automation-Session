package day5.conditionstatements;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		char bldgrp='A';
		int age=17;
		if(age>=18) {
			System.out.println("Welcome, you are above 18. Now proceed further");
			if(bldgrp=='A') {
				System.out.println("Thank you for coming, your blood group matched and you are allowed to donated blood");
			}else {
				System.out.println("Thank you for coming, your blood group not matched and you are not allowed to donated blood");
			}
		}else {
			System.out.println("Sorry, you are below 18. Not allowed to donated blood");
		}
		System.out.println("Program ends");
	}

}