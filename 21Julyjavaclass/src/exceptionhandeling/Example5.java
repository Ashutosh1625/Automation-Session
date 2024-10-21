package exceptionhandeling;

public class Example5 {


	public static void main(String[] args) {
		System.out.println("Program starts");
		int res;
		try {
			res = 10 / 0;// abnormal statement
			System.out.println("Result is: " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception msg ------"+e.getMessage()+"--------");
//			System.out.println("Exception class and msg: -----"+e+"--------");
			e.printStackTrace();//complete exception as it is
		}
		System.out.println("Program ends");
	}

}