package day21.predefinedclasses;

public class StringProgram1 {

	public static void main(String[] args) {
		String s1="Pune";//object will be created in String Constant pool
		String s2="Pune";//no object creation as its already available in String Constant Pool
		String s3="Mumbai";//object will be created in String Constant pool
		System.out.println("String1: '"+s1 + "' char count is: "+s1.length());
		System.out.println("String2: '"+s2 + "' char count is: "+s2.length());
		System.out.println("String3: '"+s3 + "' char count is: "+s3.length());
		
		System.out.println("Comparing s1 & s2 using equals() based on value: "+s1.equals(s2));
		System.out.println("Comparing s1 & s3 using equals() based on value: "+s1.equals(s3));
		System.out.println("Comparing s1 & s2 using '==' based on address: "+(s1==s2));
		System.out.println("Comparing s1 & s3 using '==' based on address: "+(s1==s3));
		
		System.out.println("*******************************************");
		String s4=new String("Bangalore");//two object will be created, 1. nonconstant pool 2. constant pool
		String s5=new String("Bangalore");//only one object,  1. nonconstant pool
		String s6=new String("Pune");//only one object,  1. nonconstant pool
		System.out.println("String1: '"+s4 + "' char count is: "+s4.length());
		System.out.println("String2: '"+s5 + "' char count is: "+s5.length());
		System.out.println("String3: '"+s6 + "' char count is: "+s6.length());
		System.out.println("Comparing s4 & s5 using equals() based on value: "+s4.equals(s5));
		System.out.println("Comparing s4 & s6 using equals() based on value: "+s4.equals(s6));
		System.out.println("Comparing s4 & s5 using '==' based on address: "+(s4==s5));
		System.out.println("Comparing s4 & s6 using '==' based on address: "+(s4==s6));
		
		System.out.println("Comparing s1 & s6 using equals() based on value: "+s1.equals(s6));
		System.out.println("Comparing s1 & s6 using '==' based on address: "+(s1==s6));
		
	}

}
/*
toString(): overrided in String class, now it will give you value stored inside the object


equals(Obj): overrided in String class, now it will compare two object based on value instead of address

== : overrided in String class, now it will compare two object based on address instead of value



*/