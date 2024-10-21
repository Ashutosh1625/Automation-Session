package day19.arraysexamples;

public class Example2 {

	public static void main(String[] args) {
int num[]= {10,20,30};
		
		System.out.println(num[0]);//10
		System.out.println(num[1]);//20
		System.out.println(num[2]);//30
		num[0]=25;
		num[1]=50;
		num[2]=45;
		System.out.println(num[0]);//25
		System.out.println(num[1]);//50
		System.out.println(num[2]);//45
	}

}
/*
when you want to declare same type of multiple variables we use Array which will help us to access
multiple values of same type with common name.
		
		arrayType[] arrayName; | arrayType []arrayName; | arrayType arrayName[];
		arrryName=new arrayType[size];
			//or
		arrayType[] arrayName = new arrayType[size];
		
		arrayType:
			primitive - byte,short,int,long,float,double,char,boolean
			non-primitive - classes
		size: number element needs to be stored in the array
		
		//or
		arrayType[] arrayName={, , , , , };
		
array element will be access using index.
by default array element are initialize based on there datatype default value
*/