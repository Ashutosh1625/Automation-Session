package arraypractice;

public class max_array {

	public static void main(String[] args) {
		int arr[]=new int [] {4,5,6,7,8,29,100};
		int max=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("largest no is "+max);
	}

}
