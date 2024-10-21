package day8.constructors;

public class GlobalVariables {

	static int age;
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		System.out.println("SGV age: "+age);
		int age=25;
		System.out.println("local age: "+age);
		//initialize local variable value to global variable
		GlobalVariables.age=age;
		System.out.println("SGV age: "+GlobalVariables.age);
		System.out.println("Program ends");
	}

}