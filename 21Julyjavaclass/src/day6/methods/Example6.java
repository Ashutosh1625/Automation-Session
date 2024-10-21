package day6.methods;

public class Example6 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example6 ref=new Example6();
		ref.printDetails();
		System.out.println("*********************************");
		ref.reverseNumber(502);
		//System.out.println(ref.reverseNumber(502));//compile time error as we can't call void return type method from print
		System.out.println("************************************");
		//ref.getReverseNumber(714);//body will be executed but return value can;t be used	
		//System.out.println(ref.getReverseNumber(714));//body and return value both will be printed
		
		int rev=ref.getReverseNumber(714);//body will be executed and return value will be stored for future use
		System.out.println(rev);
		System.out.println("Program Ends");
	}
	void printDetails() {
		System.out.println("Welcome to java session");
		System.out.println("You are learning function/method");
		System.out.println("After this, we will learn overloading");
	}
	int getReverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}	
	void reverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number: "+rev);
	}
	
}
/*
Function/method: contains set of repetitive statements which needs to executed based on the need

void: a method should be declared with void return type when we don't want to return any value to JVM
*/