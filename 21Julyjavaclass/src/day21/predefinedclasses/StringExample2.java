package day21.predefinedclasses;

public class StringExample2 {

public static void main(String[] args) {
		
		System.out.println("Hello \"Mr.KK\"");
		
		String s1="HelloHiBye";//it will create new object as its value is unique
		System.out.println("s1: "+s1);
		System.out.println("Char count in given string is: "+s1.length());
//		System.out.println("Char at index 1: "+s1.charAt(1));
//		System.out.println("Char at index 5: "+s1.charAt(5));
		
		for(int i=0;i<s1.length();i++) {
			System.out.println("Char at index "+i+": "+s1.charAt(i));
		}
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n*******************************");
		
		
		System.out.println("s1 in lower case: "+s1.toLowerCase());
		System.out.println("s1 in upper case: "+s1.toUpperCase());
		
		System.out.println("1st index of 'H' "+s1.indexOf('H'));
		System.out.println("last index of 'H' "+s1.lastIndexOf('H'));
		System.out.println("last index of 'e' "+s1.lastIndexOf('e'));
		
		System.out.println("***************************************");
		String s2="    Good Evening Everyone Welcome to Automation Session    ";
		System.out.println("s2 value is: \n"+s2+"char count: "+s2.length());
		System.out.println("remove additional pre and post spaces: \n"+s2.trim()+" char count: "+s2.trim().length());
		System.out.println("***************************************");
		String strArray[]=s2.trim().split(" ");
		for(String str:strArray) {
			System.out.println(str);
		}
		System.out.println("***************************************");
		String strArray2[]=s2.trim().split("e");
		for(String str:strArray2) {
			System.out.println(str);
		}
		System.out.println("***************************************");
		String strArray3[]=s2.trim().split("e",3);
		for(String str:strArray3) {
			System.out.println(str);
		}
	}
}
/*
String: predefined class from java.lang package

Following method of object class are overrided here-
	toString(): Actually print object into String form but here it will print value stored inside the object
	
	equals(Object obj): Actually compared two object based on address but here compare based on object value
	
	== : Actually compare two value but here it compares two object based on address
*/