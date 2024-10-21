package day12.overridingExamples;
class Demo1{
	int num=10;
	void calling() {
		System.out.println("I am calling from Demo1....");
	}
}
public class Example1 extends Demo1{
	
	void display() {
		System.out.println("Hello, I am displaying data of Example1....");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example1 e1=new Example1();
		System.out.println("num from Demo1 class using object and reference of Example1: "+e1.num);
		e1.calling();
		e1.display();
		System.out.println("*********************************");
		Demo1 d1=new Example1();
		System.out.println("num from Demo1 class using object of Example1 and reference of Demo1: "+d1.num);
		d1.calling();
		System.out.println("Program ends");
	}
}