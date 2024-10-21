package day9.thisstatements;

public class Example1 {

		Example1(){
			System.out.println("***********I am Example1, zero-param cons***************");
		}	
		Example1(int num){
			System.out.println("***********I am Example1, int-param cons***************");
		}	
		Example1(double num){
			System.out.println("***********I am Example1, double-param cons***************");
		}
		public static void main(String[] args) {
			System.out.println("Program starts");
			Example1 e1=new Example1();
			Example1 e2=new Example1(25.36f);
			Example1 e3=new Example1(85);
			System.out.println("Program ends");
		}
	}