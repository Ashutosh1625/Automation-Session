package day19.arraysexamples;

public class Example3 {

	public static void main(String[] args) {
		int num[]= {10,20,30};
		System.out.println("Number of elements in array: "+num.length);
		System.out.println(num[0]);//10
		System.out.println(num[1]);//20
		System.out.println(num[2]);//30
		System.out.println("**************Array Elements using for loop******************");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("**************Array Elements using for loop in revere order******************");
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		System.out.println("***************Array Elements using for-each loop********************");
		/*
		 * RHS is your array name and LHS is a variable with array datatype
		 * for(LHS:RHS)
		 * {
		 * 
		 * }
		 */
		for(int x:num) {
			System.out.println(x);
		}
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