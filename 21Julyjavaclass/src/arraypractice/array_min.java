package arraypractice;

public class array_min {

	public static void main(String[] args) {
		int[] array=new int[] {23,56,11,34,99};
		int min=array[0];
		for(int i=array.length-1;i>=0;i++) {
			if(array[i]>min) {
			
				min=array[i];
		}}
		 System.out.println("min num is ="+min);
		}

	}


