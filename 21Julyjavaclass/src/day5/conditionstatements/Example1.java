package day5.conditionstatements;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num = 20;
		if (num >= 0) {
			System.out.println("Given number is positive " + num);
		} else {
			System.out.println("Given number is negative " + num);
		}
		System.out.println("*******************************************");
		num = -5;
		if (num >= 0) {
			System.out.println("Given number is positive " + num);
		} else {
			System.out.println("Given number is negative " + num);
		}
		System.out.println("Program ends");

	}

}
