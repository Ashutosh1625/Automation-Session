package day19.arraysexamples;


	class Demo{		int num1,num2;
		Demo(){
			System.out.println("I am zero param cons");
		}
		Demo(int x){
			System.out.println("I am int param cons");
			num1=x;
		}
		Demo(int x,int y){
			System.out.println("I am int-int param cons");
			num1=x;
			num2=y;
		}
		void callingNumbers() {
			System.out.println("Numbers are num1: "+num1 + " & num2: "+num2);
		}
	}
	public class Example4 {
		public static void main(String[] args) {		
			Demo ref1=new Demo();		
			Demo ref2=new Demo(25);		
			Demo ref3=new Demo(75,25);
			
			ref1.callingNumbers();
			ref2.callingNumbers();
			ref3.callingNumbers();
		}
	}