package arraypractice;

public class asc_array {

	public static void main(String[] args) {
		int arr[]=new int[] {11,3,4,22,6};
		int ref=0;
for(int i=0;i<arr.length;i++) {
		//System.out.println(arr[i]);
}	
		for (int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				ref=arr[i];
				arr[i]=arr[j];
				arr[j]=ref;
			}
		}
		System.out.println(arr[i]);
		}
		

	}

}
