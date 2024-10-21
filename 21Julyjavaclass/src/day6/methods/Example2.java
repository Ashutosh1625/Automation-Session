package day6.methods;

public class Example2 {

	public static void main(String[] args) {
		
			System.out.println("Program Starts");
			printDetails();
			System.out.println("************************************");
			printDetails();
			System.out.println("###################################");
			Example2.printDetails();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			Example2.printDetails();
			System.out.println("+++++++++++++++++++++++++++++++++++");
			employeeInfo();
			System.out.println("Program Ends");
		}
		static void printDetails() {
			System.out.println("Welcome to java session");
			System.out.println("You are learning function/method");
			System.out.println("After this, we will learn overloading");
		}
		
		static void employeeInfo() {
			System.out.println("hi, I am XYZ");
			System.out.println("I am working in Google");
			System.out.println("I have completed BE");
		}
	}
	/*
	Function/method: contains set of repetitive statements which needs to executed based on the need

	void: a method should be declared with void return type when we don't want to return any value to JVM
	*/