package day8.constructors;

import java.awt.DisplayMode;

	class Sample{
		static int empId=505;
		int num=725;
		void display() {
			System.out.println("I am display from Sample class and num is "+num);
		}
	}
	public class GlobalVariables4 {
		int num=123;
		static int empId=101;
		GlobalVariables4(){
			System.out.println("**********I am GlobalVariables2 class zero-param cons*********");
		}
		public static void main(String[] args) {
			System.out.println("Program starts");
			System.out.println("Sample class empId: "+Sample.empId);
			System.out.println("GlobalVariables4 class empId: "+GlobalVariables4.empId);
			Sample s1=new Sample();
			s1.display();		
			GlobalVariables4 g1=new GlobalVariables4();
			g1.display();		
			System.out.println("Program ends");
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
		}
	}
	/*
	 * this : its known as current class instance
	 * 		  used only inside the constructor or non-static method
	 * 		  use to access non-static variable or non-static method
	 * 		  mainly used to differentiate non-static global variable its name will match with non-static 
	 * 	      method local variable
	 */