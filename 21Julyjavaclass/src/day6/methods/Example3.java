package day6.methods;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		addNumber();
		System.out.println("**********************");
		addNumber();
		System.out.println("***************************************");
		additionOfTwoNumber(20, 30);
		System.out.println("***************************************");
		additionOfTwoNumber(50, -20);
		System.out.println("Program Ends");
	}
	static void addNumber() {
		int num1=20,num2=30,res=num1+num2;
		System.out.println("Number1 "+num1);
		System.out.println("Number2 "+num2);
		System.out.println("Result "+res);
	}
	static void additionOfTwoNumber(int num1,int num2) {//int num1=20, int num2=30
		int res=num1+num2;
		System.out.println("Number1 "+num1);
		System.out.println("Number2 "+num2);
		System.out.println("Result "+res);
	}
	
}
/*
WAP to two number

Function/method: contains set of repetitive statements which needs to executed based on the need
void: a method should be declared with void return type when we don't want to return any value to JVM

parameter/argument: when you want to perform some logical operation and every time you need new value dn its recommended
					use parameter
*/