package day10.finalkeyword;

public class Example4 {

	final static int empId=101;// Final dene par glocal varable pr to initialize and dec same line pr hona chahiye
	final double salary=45000;
	public static void main(String[] args) {
		System.out.println("Program starts");
		final int age;
		age =25;
		System.out.println("Age: "+age);
		
		System.out.println("SGV empId: "+empId);
		Example4 e1=new Example4();
		System.out.println("NSGV salary: "+e1.salary);
		System.out.println("Program ends");
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
*/