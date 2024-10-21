package day7.methodoverloading;

public class Example3 {
	int age;
	double salary;
	Example3(int a){
		System.out.println("I am int-param cons of Example1 class");
		age=a;
	}
	Example3(double a){
		System.out.println("I am double-param cons of Example1 class");
		salary=a;
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 ref=new Example3(10);
		System.out.println("age value with ref : "+ref.age);
		System.out.println("salary value with ref: "+ref.salary);
		
		Example3 ref1=new Example3(55000.56);
		System.out.println("age value with ref1 : "+ref1.age);
		System.out.println("salary value with ref1: "+ref1.salary);
		
		Example3 ref2=new Example3(75000.56);
		System.out.println("age value with ref1 : "+ref2.age);
		System.out.println("salary value with ref1: "+ref2.salary);
		System.out.println("Program ends");
	}
}