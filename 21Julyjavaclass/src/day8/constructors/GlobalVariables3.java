package day8.constructors;

public class GlobalVariables3 {
	int num=123;
	static int empId=101;
	GlobalVariables3(){
		System.out.println("**********I am GlobalVariables2 class zero-param cons*********");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV empId: "+empId);
		int empId=404;
		System.out.println("local empId: "+empId);
		GlobalVariables3.empId=empId;
		System.out.println("Update SGV empId: "+GlobalVariables3.empId);
	
		GlobalVariables3 ref=new GlobalVariables3();
		//ref.calling();
		ref.display();
		System.out.println("Program ends");
	}	
	void display() {
		System.out.println("I am display "+num);
		int num=25;
		System.out.println("num from display :"+num);
		//initialize local variable value to global variable
//		GlobalVariables2 r1=new GlobalVariables2();
//		r1.num=num;
//		System.out.println("NSGV num: "+r1.num);
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