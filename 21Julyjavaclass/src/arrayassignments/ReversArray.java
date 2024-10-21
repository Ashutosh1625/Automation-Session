package arrayassignments;

public class ReversArray {

	public static void main(String[] args) {
		System.out.println("Program starts");
	   int[]intArray = {1,2,3,4,5,6,7,8,9};
	     
	  //print array starting from first element
	    System.out.println("Original Array:");
	    for(int i=0;i<intArray.length;i++)
	         System.out.print(intArray[i] + "  ");
	     
     
	    //print array starting from last element
	    System.out.println("Original Array printed in reverse order:");
	         for(int i=intArray.length-1;i>=0;i--)
	         System.out.print(intArray[i] + "  ");
	         System.out.println("Program ends");
	    }
	}