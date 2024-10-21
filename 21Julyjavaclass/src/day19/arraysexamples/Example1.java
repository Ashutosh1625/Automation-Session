package day19.arraysexamples;

public class Example1 {

	public static void main(String[] args) {
		int num1=10,num2=20,num3=30;
		
//		int[] num;//int []num; | int num[];
//		num=new int[3];
			//or
		int[] num=new int[3];
		System.out.println(num[0]);//0
		System.out.println(num[1]);//0
		System.out.println(num[2]);//0
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println(num[0]);//10
		System.out.println(num[1]);//20
		System.out.println(num[2]);//30
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