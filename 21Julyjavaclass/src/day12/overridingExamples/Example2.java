package day12.overridingExamples;
class Demo2{
	int num=10;
	void calling() {
		System.out.println("I am calling from Demo1....");
	}
}
public class Example2 extends Demo2{
	@Override
	void calling() {
		System.out.println("Overried in Example2, I am calling from Example2....");
	}
	void display() {
		System.out.println("Hello, I am displaying data of Example2....");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 e1=new Example2();
		e1.calling();//overrided body
		e1.display();
		System.out.println("*****************************");
		Demo2 d2=new Example2();
		d2.calling();//overrided body
		System.out.println("Program ends");
	}
}
/*
Overriding:
	when you try to declare a method in child class which is already present in parent class
	then that method will be known as overrided
	while overriding inheritance is mandatory
		- you can change method body
		- you can increase method visibility
				default ---> default|protected|public
				protected --> protected|public
				public ----> public
	while overriding following things are not possible
		- parameter
		- return type
		- private method 
		- constructor
		- variable
		- final method
*/