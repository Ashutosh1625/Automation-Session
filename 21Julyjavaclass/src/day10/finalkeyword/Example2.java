package day10.finalkeyword;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		final int age=25;
		System.out.println("Age: "+age);
//		age=30;//re-initialization - compile time error
//		System.out.println("updated Age: "+age);
//		age=45;//re-initialization - compile time error
//		System.out.println("updated Age: "+age);
//		age=20;//re-initialization - compile time error
//		System.out.println("updated Age: "+age);
		System.out.println("Program ends");
	}
}
/*
final keyword:
	used in variable, method & class declaration
	using this we can make variable/method/class to behave like constant
	this means once you declare them final there value can't change

*/