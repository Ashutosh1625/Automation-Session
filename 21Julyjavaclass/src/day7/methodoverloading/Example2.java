package day7.methodoverloading;

public class Example2 {

	
		int age;
		double salary;
		Example2(int a){
			System.out.println("I am int-param cons of Example1 class");
			age=a;
		}
		void Example3(double s){
			System.out.println("I am double-param cons of Example1 class");
			salary=s;
		}
		void Example4(int a ,double s){
			System.out.println("I am int double-param cons of Example1 class");
			salary=s;
			age=a;
		}
		public static void main(String[] args) {
			System.out.println("Program starts");
			Example2 ref=new Example2(10);
			System.out.println("age value with ref : "+ref.age);
			System.out.println("salary value with ref: "+ref.salary);
			
			Example2 ref1=new Example2(30);
			System.out.println("age value with ref1 : "+ref1.age);
			System.out.println("salary value with ref1: "+ref1.salary);
			System.out.println("Program ends");
			
			
			Example3 ref2=new Example3(45000.56);
			System.out.println("age value with ref2 : "+ref2.age);
			System.out.println("salary value with ref2: "+ref2.salary);
			System.out.println("Program ends");
			
			
			Example4 ref3=new Example4(25,45000.56);
			System.out.println("age value with ref3 : "+ref3.age);
			System.out.println("salary value with ref3: "+ref3.salary);
			System.out.println("Program ends");
		}
		}

	