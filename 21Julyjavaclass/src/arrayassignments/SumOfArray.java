package arrayassignments;

public class SumOfArray {

	public static void main(String[] args) {
		int[]array=new int[] {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<array.length;i++) {
	sum = sum + array[i];
		}
		System.out.println("Sum of array is "+sum);
	}

}
