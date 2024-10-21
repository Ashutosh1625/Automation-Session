package day21.predefinedclasses;

public class StringExample1 {


	public static void main(String[] args) {
		String s1="Pune";//it will create new object as its value is unique
		System.out.println("s1: "+s1);
		String s2="Mumbai";//it will create new object as its value is unique
		System.out.println("s2: "+s2);
		String s3="Pune";//it won't create new object as its value is not unique, it will point to existing object only
		System.out.println("s3: "+s1);		
		System.out.println("s1 compared with s2 using equals method: "+s1.equals(s2));
		System.out.println("s1 compared with s3 using equals method: "+s1.equals(s3));
		System.out.println("s1 compared with s2 using '==' method: "+(s1==s2));
		System.out.println("s1 compared with s3 using '==' method: "+(s1==s3));
		
		System.out.println("**************************************************");
		String s4=new String("Bangalore");//two object 1. in String constant pool | 2. in non constant pool
		String s5=new String("Bangalore");//only one in non constant pool because in constant already object with value "Bangalore" is available
		System.out.println("s4: "+s4);
		System.out.println("s5: "+s5);
		System.out.println("s4 compared with s5 using equals method: "+s5.equals(s4));
		System.out.println("s4 compared with s5 using '==' method: "+(s4==s5));		
		String s6=new String("Pune");
		System.out.println("s6: "+s6);
		System.out.println("s1 compared with s6 using equals method: "+s1.equals(s6));
		System.out.println("s1 compared with s6 using '==' method: "+(s1==s6));
	}
}
/*
String: predefined class from java.lang package

Following method of object class are overrided here-
	toString(): Actually print object into String form but here it will print value stored inside the object
	
	equals(Object obj): Actually compared two object based on address but here compare based on object value
	
	== : Actually compare two value but here it compares two object based on address
*/