package day10.finalkeyword;

public class Example6 {

	final static int empId;
	final double salary;
	public static void main(String[] args) {
		System.out.println("Program starts");
		final int age;
		age =25;
		System.out.println("Age: "+age);
		
		System.out.println("SGV empId: "+empId);
		Example6 e1=new Example6();
		System.out.println("NSGV salary: "+e1.salary);
		System.out.println("Program ends");
	}
	
	static {
		System.out.println("**************SIB-1******************");
		empId=101;
	}
	Example6(){
		System.out.println("**************zero-param cons******************");
		salary=45000;
	}
}
/*
final keyword:
	used in variable, method & class declaration
	using this we can make variable/method/class to behave like constant
	this means once you declare them final there value can't change

local variable:
	can be declare with final keyword and initialize later but before use
	
global variable:
	declare and initialization should be done on the same line if variable is declared as final
	
	static global variable:
		if you have declare SGV with final, you have an option initialize it later using static block
	
	non-static global variable:
		if you have declare SGV with final, you have two option to initialize them later
			1. non-static block
			2. constructor
*/