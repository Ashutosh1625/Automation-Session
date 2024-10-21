package day5.conditionstatements;

public class Example8 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		for(int i=1;i<=3;i++) {
			System.out.println(i);
		}
		System.out.println("***************************");
		for(int i=3;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("***************************");
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println("Even number is "+i);
			}
		}
		System.out.println("***************************");
		for(char ch='a'; ch<='z';ch++) {
			System.out.print(ch+",");
		}
		System.out.println("\n***************************");
		for(char ch='z'; ch>='a';ch--) {
			System.out.print(ch+",");
		}
		System.out.println("\nProgram ends");
	}

}
/*
for(initialization;condition;incr/decr)
{  
	//statement or code to be executed  
}
*/