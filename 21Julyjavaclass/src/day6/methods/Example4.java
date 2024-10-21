package day6.methods;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		reverseNumber(123);
		System.out.println("*******************************");
		reverseNumber(4567);
		System.out.println("********************************");
		//method body will be executed but you won;t be able to see return value in the console
			//getReverseNumber(562);
				//or
		//method body will be executed and you will be able to see return value in the console
			//System.out.println("Reverse number is: "+getReverseNumber(562));
				//or
		//method body will be executed and its return value is store in the variable for future use
		int rev=getReverseNumber(562);
		System.out.println("Reverse number is: "+rev);
		System.out.println("Program Ends");
	}
	static int getReverseNumber(int num) {
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
	
	static void reverseNumber(int num) {
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
WAP to two number

Function/method: contains set of repetitive statements which needs to executed based on the need
void: a method should be declared with void return type when we don't want to return any value to JVM

parameter/argument: when you want to perform some logical operation and every time you need new value dn its recommended
					use parameter
					
return type: when your performing some logical operation and you want your method to return that value
*/