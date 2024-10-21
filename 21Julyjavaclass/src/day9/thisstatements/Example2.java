package day9.thisstatements;

public class Example2 {

	Example2(){
		this(25);
		System.out.println("***********I am Example1, zero-param cons***************");
	}	
	Example2(int num){
		this(25.66);
		System.out.println("***********I am Example1, int-param cons***************");
	}	
	Example2(double num){
		System.out.println("***********I am Example1, double-param cons***************");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 e1=new Example2();
//		Example2 e2=new Example2(25.36f);
//		Example2 e3=new Example2(85);
		System.out.println("Program ends");
	}
}
/*
this()
	its also known as current class instance
	this statement is used to call another constructor current class based on the parameter
	its should be used inside the constructor
	its should be the 1st statement inside the constructor


*/