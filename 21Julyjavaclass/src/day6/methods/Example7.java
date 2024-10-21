package day6.methods;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example7 ref=new Example7();
		int amount=550000;
		double interest=ref.getInterest(amount, 8.5, 5);
		System.out.println("Interest on principle amount is: "+interest);
		double finalAmount=amount+interest;
		System.out.println("Final amount to be paid: "+finalAmount);
		System.out.println("Program Ends");
	}
	
	double getInterest(int p,double r, int t) {
		System.out.println("Priciple amount: "+p);
		System.out.println("ROI: "+r);
		System.out.println("Duration: "+t);
		double res=(p*r*t)/100;
		return res;
	}
	
}
/*
Function/method: contains set of repetitive statements which needs to executed based on the need

void: a method should be declared with void return type when we don't want to return any value to JVM
*/