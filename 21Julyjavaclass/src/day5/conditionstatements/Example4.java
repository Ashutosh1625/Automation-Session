package day5.conditionstatements;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		char ch='O';
		if(ch=='a' || ch=='A') {
			System.out.println("Given char is vowel and character is --> "+ch);
		}else if(ch=='e' || ch=='E') {
			System.out.println("Given char is vowel and character is --> "+ch);
		}else if(ch=='i' || ch=='I') {
			System.out.println("Given char is vowel and character is --> "+ch);
		}else if(ch=='o' || ch=='O') {
			System.out.println("Given char is vowel and character is --> "+ch);
		}else if(ch=='u' || ch=='U') {
			System.out.println("Given char is vowel and character is --> "+ch);
		}else {
			System.out.println("Given char is consoant and character is --> "+ch);
		}
		System.out.println("Program ends");
	}

}