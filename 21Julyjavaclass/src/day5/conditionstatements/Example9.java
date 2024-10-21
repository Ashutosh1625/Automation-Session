package day5.conditionstatements;

public class Example9 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int i=1;
		for(;i<=3;) {
			System.out.println(i);
			i++;
		}
		System.out.println("***************************");
		char ch='a';
		for(; ch<='z';) {
			System.out.print(ch+",");
			ch++;
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