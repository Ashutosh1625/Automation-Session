package day9.thisstatements;

public class Example3 {

	Example3(){
		this(10);
		System.out.println("***********I am Example3, zero-param cons***************");
	}	
	Example3(int num){
		System.out.println("***********I am Example3, int-param cons***************");
	}	
	Example3(double num){
		this();
		System.out.println("***********I am Example3, double-param cons***************");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
//		Example3 e1=new Example3();
		Example3 e2=new Example3(25.36f);
//		Example3 e3=new Example3(85);
		System.out.println("Program ends");
	}
}
/*
int
zero
double

this()
	its also known as current class instance
	this statement is used to call another constructor current class based on the parameter
	its should be used inside the constructor
	its should be the 1st statement inside the constructor


*/