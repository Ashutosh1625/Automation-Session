package day7.methodoverloading;

public class Example1 {

		int age;
		double salary;
		Example1(){
			System.out.println("I am zero-param cons of Example1 class");
		}
		public static void main(String[] args) {
			System.out.println("Program starts");
			Example1 ref=new Example1();
			System.out.println("age value with ref : "+ref.age);
			System.out.println("salary value with ref: "+ref.salary);
			ref.age=25;
			ref.salary=45000.56;
			System.out.println("updated, age value with ref : "+ref.age);
			System.out.println("updated, salary value with ref: "+ref.salary);
			
			Example1 ref1=new Example1();
			System.out.println("age value with ref1 : "+ref1.age);
			System.out.println("salary value with ref1: "+ref1.salary);
			System.out.println("Program ends");
		}

	}