package day5.conditionstatements;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		char ch='a';
		switch(ch) {
		case 'a':
			System.out.println("Given char is vowel and character is (a)--> "+ch);
			break;
		case 'e':
			System.out.println("Given char is vowel and character is (e)--> "+ch);
			break;
		case 'i':
			System.out.println("Given char is vowel and character is (i)--> "+ch);
			break;
		case 'o':
			System.out.println("Given char is vowel and character is (o)--> "+ch);
			break;
		case 'u':
			System.out.println("Given char is vowel and character is (o)--> "+ch);
			break;
		default:
			System.out.println("Given char is consoant and character is --> "+ch);
			break;
		}
		System.out.println("Program ends");
	}

}
