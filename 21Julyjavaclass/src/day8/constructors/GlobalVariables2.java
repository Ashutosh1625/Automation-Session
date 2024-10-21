package day8.constructors;

public class GlobalVariables2 {

		int num=123;
		GlobalVariables2(){
			System.out.println("**********I am GlobalVariables2 class zero-param cons*********");
		}
		public static void main(String[] args) {
			System.out.println("Program starts");
			GlobalVariables2 ref=new GlobalVariables2();
			//ref.calling();
			ref.display();
			System.out.println("ref value from main: "+ref);
			System.out.println("Program ends");
		}	
		void calling() {
			System.out.println("I am calling "+num);
			int num=25;
			System.out.println("num from calling :"+num);
			//initialize local variable value to global variable
			GlobalVariables2 r1=new GlobalVariables2();
			r1.num=num;
			System.out.println("NSGV num: "+r1.num);
		}
		void display() {
			System.out.println("I am display "+num);
			int num=25;
			System.out.println("num from display :"+num);
			//initialize local variable value to global variable
//			GlobalVariables2 r1=new GlobalVariables2();
//			r1.num=num;
//			System.out.println("NSGV num: "+r1.num);
					//or
			this.num=num;
			System.out.println("NSGV num: "+this.num);
			System.out.println("this keyword value from display: "+this);
		}
	}

	/*
	 * this : its known as current class instance
	 * 		  used only inside the constructor or non-static method
	 * 		  use to access non-static variable or non-static method
	 * 		  mainly used to differentiate non-static global variable its name will match with non-static 
	 * 	      method local variable
	 */