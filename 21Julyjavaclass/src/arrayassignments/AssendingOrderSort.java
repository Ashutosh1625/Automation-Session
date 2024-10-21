package arrayassignments;

public class AssendingOrderSort {

	public static void main(String[] args) {
int[]arr=new int[] {2,4,3,5,1};
int ref=0;
System.out.println("original array is ");
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+"  ");
}
//Sort the array in ascending order 
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if (arr[i]>arr[j]) {
			ref=arr[i];
			arr[i]=arr[j];
			arr[j]=ref;
		}
	}
}
System.out.println();    

//Displaying elements of array after sorting    
System.out.println("Elements of array sorted in ascending order: ");    
for (int i = 0; i < arr.length; i++) {     
    System.out.print(arr[i] + " ");    
	}
}
}
