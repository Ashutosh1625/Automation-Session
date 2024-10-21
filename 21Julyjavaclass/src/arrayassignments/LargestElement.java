package arrayassignments;

public class LargestElement {

	public static void main(String[] args) {
		//initilize array
int[] array=new int[]{45,2,34,4,55};
//initilize max
int max = array[0];
for(int i=0;i<array.length;i++) {
	if (array[i]>max)
		max=array[i];
}
System.out.println("Largest element in array is "+max);
	}

}
