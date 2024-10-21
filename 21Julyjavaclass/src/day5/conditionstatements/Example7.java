package day5.conditionstatements;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		char ch='+';
		int num1=25,num2=5,res;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number1 is: "+num2);
		switch(ch) {
		case '+':
			res=num1+num2;
			System.out.println("Addition of two number is "+res);
			break;
		case '-':
			res=num1-num2;
			System.out.println("Substraction of two number is "+res);
			break;
		case '*':
			res=num1*num2;
			System.out.println("Multipication of two number is "+res);
			break;
		case '/':
			res=num1/num2;
			System.out.println("Division of two number is "+res);
			break;
		case '%':
			res=num1%num2;
			System.out.println("MOD of two number is "+res);
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
		System.out.println("Program ends");
	}

}
