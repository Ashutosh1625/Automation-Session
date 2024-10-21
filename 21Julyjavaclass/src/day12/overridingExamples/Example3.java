package day12.overridingExamples;
class Demo3{
	int num=10;
	void calling() {
		System.out.println("I am calling from Demo1....");
	}
}
public class Example3 extends Demo3{
	int num=25;
	@Override
	void calling() {
		System.out.println("Overried in Example2, I am calling from Example2....");
	}
	void display() {
		System.out.println("Hello, I am displaying data of Example2....");
		System.out.println("num from Example3: "+num);
//		Demo3 d1=new Demo3();
//		d1.calling();
//		System.out.println("num from Demo3: "+d1.num);
			//or
		super.calling();
		System.out.println("num from Demo3 using super keyword: "+super.num);
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 e1=new Example3();
		e1.display();
		System.out.println("Program ends");
	}
}
/*
super keyword:
	its known as parent class instance
	used to access parent class non-static members from child class non-static method or constructor
	mainly used when parent and child class are having common name for variable and methods

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