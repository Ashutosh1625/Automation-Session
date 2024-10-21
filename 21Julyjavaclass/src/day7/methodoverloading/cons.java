package day7.methodoverloading;
public class cons {
	//this class has default constructor
//	Cons(){
//		//empty body
//	}
	
	
	int age=25,empid;
	public static void main(String[] args) {
		cons ref=new cons();
		System.out.println(ref.age);
		System.out.println(ref.empid);
	}

}
/*
its similar to a method but,
    * its name should be same as class
    * its won't have return type so won;t return any value

its is used to initialize non-static member of the class into the object memory

type:
   1. default constructor - written by java compiler
   		only when class doesn't have any constructor
   		this constructor won't be having any parameter and its body will be empty
   2. user defined constructor


*/