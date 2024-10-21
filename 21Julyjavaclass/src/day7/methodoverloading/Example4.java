package day7.methodoverloading;

public class Example4 {

	int age;
	double salary;
	Example4(int a){
		System.out.println("I am int-param cons of Example1 class");
		age=a;
	}
	Example4(double a){
		System.out.println("I am double-param cons of Example1 class");
		salary=a;
	}
	Example4(int a,double b){
		System.out.println("I am int-double-param cons of Example1 class");
		salary=b;
		age=a;	
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example4 ref=new Example4(10,85000.47);
		System.out.println("age value with ref : "+ref.age);
		System.out.println("salary value with ref: "+ref.salary);
		
		Example4 ref1=new Example4(55000.56);
		System.out.println("age value with ref1 : "+ref1.age);
		System.out.println("salary value with ref1: "+ref1.salary);
		
		Example4 ref2=new Example4(56);
		System.out.println("age value with ref1 : "+ref2.age);
		System.out.println("salary value with ref1: "+ref2.salary);
		System.out.println("Program ends");
	}
}