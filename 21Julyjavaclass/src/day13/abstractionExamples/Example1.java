package day13.abstractionExamples;
abstract class Demo{
	/*
	 * variable
	 * constructor
	 * method
	 * 		abstract method- method without body
	 * 		non-abstract method/normal method
	 * 50% abstract
	 */
	abstract void calling();
	void display() {
		System.out.println("I am display");
	}
}
abstract class Demo2{
	/* 100% abstract */
	abstract void calling();
	abstract void display();
}
abstract class Demo3{
	/* 0% abstract */
	void calling() {
		
	}
	void display() {
		
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}