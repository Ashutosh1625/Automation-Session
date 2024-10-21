package arrayassignments;

public class OddPositionElements {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6};
		System.out.println("elements present on even position is");
		for (int i=0; i <array.length ; i=i+2) {
			System.out.println(array[i]);
		
		}

	}

}
