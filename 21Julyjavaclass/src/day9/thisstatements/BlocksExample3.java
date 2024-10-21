package day9.thisstatements;

public class BlocksExample3 {

	static {
		System.out.println("*************SIB-1****************");
	}
	BlocksExample3(){
		System.out.println("BlocksExample1 class zero param cons");
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		BlocksExample3 b1=new BlocksExample3();
		System.out.println("-------------------------------------");
		BlocksExample3 b2=new BlocksExample3();
		System.out.println("Program ends");
	}
	static {
		System.out.println("*************SIB-2****************");
	}
	
	{
		System.out.println("*************NSIB-1****************");
	}
	
	{
		System.out.println("*************NSIB-2****************");
	}
}
/*
blocks:
	
	static{
		//static block | SIB 
	}
	
	{
		//non-static block | NSIB
	}

SIB:
	these block will be executed before main method
	we can have multiple SIB in a class, in this case all SIB will be executed in sequential order before main()
	basically used to provide important information before entering into actual logic
NSIB:
	these block will be executed when any instance of a class is created but before constructor
	we can have multiple NSIB in a class, in this case all NSIB will be executed in sequential order before constructor
	basically used to provide information before you start using the created object
*/