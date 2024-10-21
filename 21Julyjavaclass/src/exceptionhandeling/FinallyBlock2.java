package exceptionhandeling;

public class FinallyBlock2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int res;
		try {
			res = 10 / 2;// normal statement
			System.out.println("Result is: " + res);
		} catch (ArithmeticException e) {
			System.out.println("Exception msg ------"+e.getMessage()+"--------");
		}finally {
			System.out.println("I am a finally block...");
		}
		System.out.println("Program ends");
	}
}