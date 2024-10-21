package arrayassignments;

public class EvenPositionArray {

	public static void main(String[] args) {
		//initialization
		int[] array=new int[] {1,2,3,4,5,6};
		System.out.println("elements present on even position is");
		for (int i=1; i <array.length ; i=i+2) {
			System.out.println(array[i]);
		
		}

	}

}
