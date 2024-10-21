package arrayassignments;

public class DuplicateElements {

	public static void main(String[] args) {
		System.out.println("Program starts");
//initialize 
		int[] array = new int[] { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 9, 3 };
		System.out.println("Duplicte elements in above array is ");
// search for duplicate elements
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[j]);
			}

		}
	}
}
